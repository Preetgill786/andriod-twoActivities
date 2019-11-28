package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener,  AdapterView.OnItemSelectedListener {
    EditText etCad, etToCurrency;
    Button btnConvert ,btnClear,btNext;
    Spinner sp;
    double result;
    //ratelist array
    double []rateList = {0.75,0.68,53.88,1.11,0.58};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etCad = findViewById(R.id.cad);
        etToCurrency = findViewById(R.id.toCurrency);

        btnConvert = findViewById(R.id.convert);
        btnClear = findViewById(R.id.clear);
        btNext=findViewById(R.id.next);

        //creating list for currencies
        List<String> currency = new ArrayList<String>();
        currency.add("USD");
        currency.add("EURO");
        currency.add("INR");
        currency.add("AUS");
        currency.add("GBP");






       btnConvert.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btNext.setOnClickListener(this);
        sp= findViewById(R.id.selectedCurrency);
        //create an adapter and fill it from the list
        ArrayAdapter<String> currencyAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,currency);
        //make the drop down style
        currencyAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        sp.setAdapter(currencyAdapter);
        sp.setOnItemSelectedListener(this);
    }




    @Override
    public void onClick(View v) {


        switch (v.getId()){
            case R.id.clear:
                etCad.setText("");
                etToCurrency.setText("");
                result = 0;
                break;
            case R.id.convert:
                Double Amt = new Double(result);
                etToCurrency.setText(Amt.toString());
                break;
            case R.id.next:
                Intent act2 = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(act2);
                break;


    }
    }





    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {


        if (etCad.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter the amount in CAD...!", Toast.LENGTH_LONG).show();
                } else {

                    double cad = Double.parseDouble(etCad.getText().toString());
                   double amt = cad * rateList[position];
                   result = amt;

                }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}