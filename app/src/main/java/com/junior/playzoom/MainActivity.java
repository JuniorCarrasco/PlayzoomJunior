package com.junior.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.junior.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //private Button btnGetStarted;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGetStarted.setOnClickListener(v -> {
            Toast.makeText(this, "Presiono el boton", Toast.LENGTH_LONG).show();
        });
        binding.txtMoviewPhrase.setText("Mira tu pelicula \nfavorita.");
        binding.btnGetStarted.setText("Presiona boton");

        //setContentView(R.layout.activity_main);

        // btnGetStarted = findViewById(R.id.btn_get_started);
        //btnGetStarted.setOnClickListener(v -> {
        //    Toast.makeText(this, "Presiono el boton", Toast.LENGTH_LONG).show();
        //});
    }
}