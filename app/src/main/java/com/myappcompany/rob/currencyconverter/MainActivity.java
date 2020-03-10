package com.myappcompany.rob.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInEuros = editText.getText().toString();

        double amountInEurosDouble = Double.parseDouble(amountInEuros);

        double amountInDollarsDouble = amountInEurosDouble * 1.13;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this,  amountInEuros + " € "+ " is " + amountInDollarsString + " $", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
