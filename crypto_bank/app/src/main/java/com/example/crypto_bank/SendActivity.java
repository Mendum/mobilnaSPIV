package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {

    EditText textName,textAmount;
    Button buttonSend;
    SharedPreferences SP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        SP = getApplicationContext().getSharedPreferences("preferences", MODE_PRIVATE);
        final SharedPreferences.Editor SPEditor = SP.edit();
        textName = (EditText) findViewById(R.id.textName);
        textAmount = (EditText) findViewById(R.id.textAmount);
        buttonSend= (Button)findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), HomeActivity.class);
                Integer amount = Integer.parseInt(textAmount.getText().toString());
                Integer balance = Integer.parseInt(SP.getString("Bitcoin", "0"));
                if(amount > balance){
                    Toast.makeText(getApplicationContext(), "Not enough balance!", Toast.LENGTH_SHORT).show();
                }else{
                    SPEditor.putString("Bitcoin", String.valueOf(balance - amount));
                    SPEditor.apply();
                }
                startActivity(i);
            }
        });
    }
}