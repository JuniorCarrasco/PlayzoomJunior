package com.junior.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.junior.playzoom.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding; //BINDING
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater()); //BINDING
        setContentView(binding.getRoot()); //BINDING
    }
}