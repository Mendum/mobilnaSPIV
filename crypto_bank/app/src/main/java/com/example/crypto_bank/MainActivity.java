package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textName,textEmail,textTelNum,textTaxID,textBirthDate;
    Button buttonRegister;
    SharedPreferences SP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SP = getApplicationContext().getSharedPreferences("preferences", MODE_PRIVATE);
        final SharedPreferences.Editor SPEditor = SP.edit();
        textName = (EditText) findViewById(R.id.textName);
        textEmail = (EditText) findViewById(R.id.textEmail);
        textTelNum = (EditText) findViewById(R.id.textTelNum);
        textTaxID = (EditText) findViewById(R.id.textTaxID);
        textBirthDate = (EditText) findViewById(R.id.textBirthDate);
        buttonRegister= (Button)findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), HomeActivity.class);
                SPEditor.putString("name",textName.getText().toString());
                SPEditor.putString("email",textEmail.getText().toString());
                SPEditor.putString("telNum", textTelNum.getText().toString());
                SPEditor.putString("taxID", textTaxID.getText().toString());
                SPEditor.putString("birthDate", textBirthDate.getText().toString());
                SPEditor.putString("Bitcoin", "100");
                SPEditor.apply();
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}