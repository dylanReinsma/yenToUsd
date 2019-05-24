package com.dylanreinsma.yentousd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        EditText currencyEditText = findViewById(R.id.currencyEditText);
        String amountInYen = currencyEditText.getText().toString();
        if (amountInYen.isEmpty()) {
            Toast.makeText(this, "Amount is empty.", Toast.LENGTH_SHORT).show();
        } else {
        Double amountInYenDouble = Double.parseDouble(amountInYen);
        Double amountInUsdDouble = amountInYenDouble * 0.0091;
        String conversion = String.format("%.2f", amountInUsdDouble);
        Toast.makeText(this, "Amount in USD is: $ " + conversion, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
