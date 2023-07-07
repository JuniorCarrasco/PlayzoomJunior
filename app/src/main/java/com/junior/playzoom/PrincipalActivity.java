package com.junior.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.junior.playzoom.databinding.ActivityPrincipalBinding;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;//BINDING

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());//BINDING
        setContentView(binding.getRoot());//BINDING
    }
}