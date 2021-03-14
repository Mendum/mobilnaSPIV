package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView textBalance;
    Button buttonSend,buttonTransakcije,buttonProfil;
    SharedPreferences SP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        SP = getApplicationContext().getSharedPreferences("preferences", MODE_PRIVATE);
        textBalance = (TextView) findViewById(R.id.textBalance);
        textBalance.setText(SP.getString("Bitcoin", "0") + "BTC");
        buttonSend = (Button) findViewById(R.id.buttonSend);
        buttonTransakcije = (Button) findViewById(R.id.buttonTransakcije);
        buttonProfil = (Button) findViewById(R.id.buttonProfil);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), SendActivity.class);
                startActivity(i);
            }
        });

        buttonTransakcije.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), TransactionActivity.class);
                startActivity(i);
            }
        });

        buttonProfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), ProfileActivity.class);
                startActivity(i);
            }
        });
    }
}