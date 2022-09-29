package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginscreen.databinding.ActivityFormLoginBinding;

public class FormLogin extends AppCompatActivity {

    private TextView text_register_screen;

    private AppBarConfiguration appBarConfiguration;
    private ActivityFormLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        StartComponents();

        text_register_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this,Resgister.class);
                startActivity(intent);
            }

        });


    }



    private void StartComponents(){
        text_register_screen = findViewById(R.id.text_register);
    }
}