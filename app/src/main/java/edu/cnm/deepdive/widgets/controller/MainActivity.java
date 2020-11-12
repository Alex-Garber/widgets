package edu.cnm.deepdive.widgets.controller;


import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import edu.cnm.deepdive.widgets.R;
import edu.cnm.deepdive.widgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


    private void computeAndDisplaySum() {
        double Fahrenheit;
        String input1 = binding.input1.getText().toString().trim();
        if (input1.isEmpty()){
            input1 = "0";
            binding.input1.setText(input1);
            Fahrenheit = 0;
        }else {
            Fahrenheit = Double.parseDouble(input1);
        }
        double Celsius;
        String input2 = binding.input2.getText().toString().trim();
        if (input2.isEmpty()){
            input2 = "0";
            binding.input2.setText(input1);
            Celsius = 0;
        }else {
            Celsius = Double.parseDouble(input2);
        }


        double valueK;
        String Kelvin = binding.input3.getText().toString().trim();
        if (Kelvin.isEmpty()){
            Kelvin = "0";
            binding.input3.setText(input1);
            valueK = 0;
        }else {
            valueK = Double.parseDouble(input1);
        }

    }
}