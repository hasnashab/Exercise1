package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;
    TextView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);
        daftar = findViewById(R.id.daftar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String password = "123456";

                if (nama.isEmpty() || password.isEmpty()) {
                    edemail.setError("Email tidak boleh kosong!");
                    edpassword.setError("Password tidak boleh kosong!");
                } else {
                    if (nama.equals(email) && password.equals(password)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Berhasil", Toast.LENGTH_LONG);
                        t.show();
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login gagal", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,class_Pendaftaran.class);
                startActivity(i);
            }
        });
    }
}