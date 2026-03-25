package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nom = findViewById(R.id.txtNom);
        TextView email = findViewById(R.id.txtEmail);
        TextView phone = findViewById(R.id.txtPhone);
        TextView adresse = findViewById(R.id.txtAdresse);
        TextView ville = findViewById(R.id.txtVille);

        Intent i = getIntent();

        nom.setText("Nom : " + i.getStringExtra("nom"));
        email.setText("Email : " + i.getStringExtra("email"));
        phone.setText("Phone : " + i.getStringExtra("phone"));
        adresse.setText("Adresse : " + i.getStringExtra("adresse"));
        ville.setText("Ville : " + i.getStringExtra("ville"));
    }
}