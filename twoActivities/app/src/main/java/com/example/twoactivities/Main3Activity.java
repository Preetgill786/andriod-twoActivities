package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    EditText etFrom,etTo;
    Button btnClear1,btnBack;
Spinner sp1,sp2;
double result;
    //ratelist array
    double []rateList = {0.75,0.68,53.88,1.11,0.58};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etFrom=findViewById(R.id.fromCurrency);
        etTo= findViewById(R.id.tocurr);
        sp1=findViewById(R.id.selectedCurrency1);
        sp2=findViewById(R.id.selectedCurrency2);

        btnClear1=findViewById(R.id.clear1);
        btnBack= findViewById(R.id.back);
//creating list for currencies
        List<String> currency = new ArrayList<String>();
        currency.add("USD");
        currency.add("EURO");
        currency.add("INR");
        currency.add("AUS");
        currency.add("GBP");


btnClear1.setOnClickListener(this);
btnBack.setOnClickListener(this);

        //create an adapter and fill it from the list
        ArrayAdapter<String> currencyAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,currency);
        //make the drop down style
        currencyAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        sp1.setAdapter(currencyAdapter);
        sp1.setOnItemSelectedListener(this);

        //make the drop down style
        currencyAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        sp2.setAdapter(currencyAdapter);
        sp2.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clear1:
                etFrom.setText("");
                etTo.setText("");
                result = 0;
                break;

            case R.id.back:
                Intent act3 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(act3);
                break;


        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        if (!etFrom.getText().toString().trim().equals("")) {
            double amtFrom = Double.parseDouble(etFrom.getText().toString());
            double amt = amtFrom * rateList[position];
            result = amt;
            Double Result = new Double(result);
            etTo.setText(Result.toString());
        }
        else if(!etFrom.getText().toString().trim().equals("")){
            double amtTo = Double.parseDouble(etTo.getText().toString());
            double amt = amtTo * rateList[position];
            result = amt;
            Double Result1 = new Double(result);
            etFrom.setText(Result1.toString());
        }else //if both are empty
            Toast.makeText(getApplicationContext(), "Please enter the amount in CAD...!", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
