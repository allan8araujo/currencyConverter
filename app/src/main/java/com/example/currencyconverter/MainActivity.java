package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.currencyconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText etValorBrl = binding.etValue;
        Button buttonCalculate = binding.buttonCalculate;
        buttonCalculate.setOnClickListener(this);
        this.clearValues();

        etValorBrl.getText();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Informe um valor!", Toast.LENGTH_SHORT).show();

        if (view.getId() == R.id.button_calculate){
           String value = binding.etValue.getText().toString();
           if (!value.isEmpty()){
               Double real = Double.valueOf(value);
               binding.textDolar.setText(String.format("%.2f", real/5.5));
               binding.textEuro.setText(String.format("%.2f", real/5.61));
           } else{
               Toast.makeText(this, "Informe um valor!", Toast.LENGTH_SHORT).show();
           }
        }
    }

    private void clearValues(){
        binding.textDolar.setText("");
        binding.textEuro.setText("");
    }
}