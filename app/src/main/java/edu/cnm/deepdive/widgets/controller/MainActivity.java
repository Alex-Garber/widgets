package edu.cnm.deepdive.widgets.controller;


import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import edu.cnm.deepdive.widgets.R;
import edu.cnm.deepdive.widgets.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements TextWatcher {

private ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.input1.addTextChangedListener(this);
        binding.input2.addTextChangedListener(this);
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
//        double valueC;
//        String input2 = binding.input2.getText().toString().trim();
//        if (input2.isEmpty()){
//            input2 = "0";
//            binding.input2.setText(input1);
//            valueC = 0;
//        }else {
//            valueC = Double.parseDouble(input2);
//        }
//
//
//        double valueK;
//        String input3 = binding.input3.getText().toString().trim();
//        if (input3.isEmpty()){
//            input3 = "0";
//            binding.input3.setText(input1);
//            valueK = 0;
//        }else {
//            valueK = Double.parseDouble(input1);
//        }
        double sumF = Fahrenheit;
        binding.output1.setText(getString(R.string.sum_resource, sumF));

        double sumC = Fahrenheit - 32 / 1.8 ;
        binding.output2.setText(getString(R.string.sum_resource, sumC));

        double sumK = (Fahrenheit + 459.67) * 5/9  ;
        binding.output3.setText(getString(R.string.sum_resource, sumK));
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        computeAndDisplaySum();

    }
}