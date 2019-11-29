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

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    EditText etFrom, etTo;
    Button btnClear1, btnBack, btncnvrt;
    Spinner sp1 = null;
    Spinner sp2 = null;
    double result;
    //ratelist array
    double[] rateList = {0.75, 0.68, 53.88, 1.11, 0.58};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etFrom = findViewById(R.id.fromCurrency);
        etTo = findViewById(R.id.tocurr);
        sp1 = findViewById(R.id.selectedCurrency1);
        sp2 = findViewById(R.id.selectedCurrency2);
        btncnvrt = findViewById(R.id.convert1);
        btnClear1 = findViewById(R.id.clear1);
        btnBack = findViewById(R.id.back);
//creating list for currencies
        List<String> currency = new ArrayList<String>();
        currency.add("CAD");
        currency.add("USD");
        currency.add("EURO");
        currency.add("INR");
        currency.add("AUS");
        currency.add("GBP");


        btnClear1.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btncnvrt.setOnClickListener(this);
        //create an adapter and fill it from the list
        ArrayAdapter<String> currencyAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, currency);
        //make the drop down style
        currencyAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        sp1.setAdapter(currencyAdapter);
        //sp1.setOnItemSelectedListener(this);

        //make the drop down style
        currencyAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //fill the spinner with the adapter items
        sp2.setAdapter(currencyAdapter);
        //sp2.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clear1:
                etFrom.setText("");
                etTo.setText("");
                result = 0;
                break;

            case R.id.convert1:

                String sp01 = sp1.getSelectedItem().toString();
                String sp02 = sp2.getSelectedItem().toString();
                double amt;
                double amtFrom;

                if (!etFrom.getText().toString().trim().equals("")) {

                    switch (sp01) {
                        case "CAD":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.75;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.68;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 53.88;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.11;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.58;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result = new Double(result);
                            etTo.setText(Result.toString());
                            break;

                        case "USD":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.33;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.91;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 71.73;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.48;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.77;
                                    result = amt;


                                    break;


                            }
                            Double Result1 = new Double(result);
                            etTo.setText(Result1.toString());
                            break;

                        case "EURO":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.46;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.10;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 79.01;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.63;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.85;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result2 = new Double(result);
                            etTo.setText(Result2.toString());
                            break;
                        case "INR":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.019;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.014;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.013;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.021;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.011;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result3 = new Double(result);
                            etTo.setText(Result3.toString());
                            break;

                        case "AUS":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.90;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.68;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.61;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 48.48;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 0.52;
                                    result = amt;


                                    break;


                            }
                            Double Result4 = new Double(result);
                            etTo.setText(Result4.toString());
                            break;
                        case "GBP":


                            switch (sp02) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.72;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.29;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.17;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 92.72;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1.91;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result5 = new Double(result);
                            etTo.setText(Result5.toString());
                            break;

                        default:
                            break;
                    }

                } else if (!etTo.getText().toString().trim().equals("")) {

                    switch (sp02) {
                        case "CAD":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.75;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.68;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 53.88;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.11;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.58;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result = new Double(result);
                            etFrom.setText(Result.toString());
                            break;

                        case "USD":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.33;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.91;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 71.73;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.48;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.77;
                                    result = amt;


                                    break;


                            }
                            Double Result1 = new Double(result);
                            etFrom.setText(Result1.toString());
                            break;

                        case "EURO":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.46;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.10;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 79.01;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.63;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.85;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result2 = new Double(result);
                            etFrom.setText(Result2.toString());
                            break;
                        case "INR":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.019;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.014;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.013;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etFrom.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.021;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.011;
                                    result = amt;


                                    break;

                                default:
                                    break;
                            }
                            Double Result3 = new Double(result);
                            etFrom.setText(Result3.toString());
                            break;

                        case "AUS":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.90;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.68;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.61;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 48.48;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 0.52;
                                    result = amt;


                                    break;


                            }
                            Double Result4 = new Double(result);
                            etFrom.setText(Result4.toString());
                            break;
                        case "GBP":


                            switch (sp01) {
                                case "CAD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.72;
                                    result = amt;


                                    break;
                                case "USD":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.29;
                                    result = amt;


                                    break;
                                case "EURO":
                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.17;
                                    result = amt;


                                    break;
                                case "INR":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 92.72;
                                    result = amt;


                                    break;
                                case "AUS":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1.91;
                                    result = amt;


                                    break;
                                case "GBP":

                                    amtFrom = Double.parseDouble(etTo.getText().toString());
                                    amt = amtFrom * 1;
                                    result = amt;


                                    break;


                            }
                            Double Result5 = new Double(result);
                            etFrom.setText(Result5.toString());

                            break;


                    }

                }
                break;
            case R.id.back:
                Intent act3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(act3);
                break;


        }
    }
}

