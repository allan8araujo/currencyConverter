package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.currencyconverter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EditText etValorBrl = binding.etValue;
        Button buttonCalculate = binding.buttonCalculate;
        buttonCalculate.setOnClickListener(this);
        TextView textDolar = binding.textDolar;
        textDolar.setText("");
        TextView textEuro = binding.textEuro;
        textEuro.setText("");

        etValorBrl.getText();

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == findViewById(R.id.button_calculate).getId()){
            // TODO implementar função de logica de conversão
        }
    }
}