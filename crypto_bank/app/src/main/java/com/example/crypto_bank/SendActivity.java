package com.example.crypto_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {

    EditText textName,textAmount;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        textName = (EditText) findViewById(R.id.textName);
        textAmount = (EditText) findViewById(R.id.textAmount);
        buttonSend= (Button)findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), HomeActivity.class);
                i.putExtra("amount",textAmount.getText().toString());
                startActivity(i);
            }
        });
    }
}