package com.example.skyskync_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.skyskync_mobile.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }



    public void onClickEntrar(View view) {

        String email = binding.etEmail.getText().toString();
        String password = binding.etPassword.getText().toString();

        if(!isEmailValido(email)){
            binding.etEmail.setError("Email Inválido");
            return;
        }
        if(!isPasswordValida(password)){
            binding.etPassword.setError("Password Incorreta");
            return;
        }

        Intent intent = new Intent(this, MenuMainActivity.class);
        intent.putExtra("EMAIL", email);
        startActivity(intent);
        finish();

    }


    // email válido?
    private boolean isEmailValido(String email) {
        if (email == null)
            return false;
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    // password com pelo menos 4 caracteres?
    private boolean isPasswordValida(String password) {
        if (password == null)
            return false;
        return password.length() >= 4;
    }
}