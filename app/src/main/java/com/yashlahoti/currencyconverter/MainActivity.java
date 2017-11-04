package com.yashlahoti.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {
        EditText usdText = (EditText)findViewById(R.id.usdText);
        double usd = Double.parseDouble(usdText.getText().toString());
        Toast.makeText(MainActivity.this, "Rs."+(int) (usd*64.75)+"!", Toast.LENGTH_SHORT).show();
    }
}
