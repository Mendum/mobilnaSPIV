package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView name;
    TextView email;
    TextView phone;
    TextView taxID;
    TextView birthdate;
    SharedPreferences SP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        SP = getApplicationContext().getSharedPreferences("preferences", MODE_PRIVATE);
        name = (TextView)findViewById(R.id.nameText);
        email = (TextView)findViewById(R.id.emailText);
        phone = (TextView)findViewById(R.id.phoneText);
        taxID = (TextView)findViewById(R.id.taxIdText);
        birthdate = (TextView)findViewById(R.id.birthDateText);
        name.setText(SP.getString("name", ""));
        email.setText(SP.getString("email", ""));
        phone.setText(SP.getString("telNum", ""));
        taxID.setText(SP.getString("taxID", ""));
        birthdate.setText(SP.getString("birthDate", ""));
    }
}