package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textName,textEmail,textTelNum,textTaxID,textBirthDate;
    Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = (EditText) findViewById(R.id.textName);
        textEmail = (EditText) findViewById(R.id.textEmail);
        textTelNum = (EditText) findViewById(R.id.textTelNum);
        textTaxID = (EditText) findViewById(R.id.textTaxID);
        textBirthDate = (EditText) findViewById(R.id.textBirthDate);

        buttonRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), ProfileActivity.class);
                i.putExtra("name",textName.getText().toString());
                i.putExtra("email",textEmail.getText().toString());
                i.putExtra("telNum",textTelNum.getText().toString());
                i.putExtra("taxID",textTaxID.getText().toString());
                i.putExtra("birthDate",textBirthDate.getText().toString());
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}