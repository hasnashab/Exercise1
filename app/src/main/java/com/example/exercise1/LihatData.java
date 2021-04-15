package com.example.exercise1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lihatdata);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
        switch (nama)
        {
            case "Yasfa":
                tvnama.setText("Yasfa N");
                tvnomor.setText("08122233344");
                break;
            case "Laela":
                tvnama.setText("Laela W");
                tvnomor.setText("08133224455");
                break;
            case "Muna":
                tvnama.setText("Munawir");
                tvnomor.setText("08125533344");
                break;
            case "Husna":
                tvnama.setText("Husna S");
                tvnomor.setText("08122453344");
                break;
            case "Sekar":
                tvnama.setText("Sekar P");
                tvnomor.setText("08126633344");
                break;
            case "Denise":
                tvnama.setText("Denise A");
                tvnomor.setText("08122555344");
                break;
            case "Slavina":
                tvnama.setText("Slavina N");
                tvnomor.setText("08125556344");
                break;
            case "Alaysa":
                tvnama.setText("Alaysa S");
                tvnomor.setText("08199233344");
                break;
            case "Latjuba":
                tvnama.setText("Latjuba");
                tvnomor.setText("08122233234");
                break;
            case "Gazbi":
                tvnama.setText("Gazbi P");
                tvnomor.setText("08122969344");
                break;
        }
    }
}
