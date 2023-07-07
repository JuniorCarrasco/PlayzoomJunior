package com.junior.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.junior.playzoom.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding; //BINDING
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Base_Theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding = ActivityLoginBinding.inflate(getLayoutInflater()); //BINDING
        setContentView(binding.getRoot()); //BINDING

        binding.btnLogin.setOnClickListener(v -> {
            //Toast.makeText(this,"Datos correctos...", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, PrincipalActivity.class);
            startActivity(intent);
        });
        binding.titleEmail.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean isOk = isCredentialsValidate(s.toString(),binding.tilPassword.getEditText().getText().toString());
                binding.btnLogin.setEnabled(isOk);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        binding.tilPassword.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int before) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean isOk = isCredentialsValidate(binding.titleEmail.getEditText().getText().toString(), s.toString());
                binding.btnLogin.setEnabled(isOk);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

    }

    private Boolean isCredentialsValidate(String email, String password){
        boolean isEmailOk = !email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches();
        boolean isPasswordOk = password.length() >= 8;

        return isEmailOk && isPasswordOk;


    }
}