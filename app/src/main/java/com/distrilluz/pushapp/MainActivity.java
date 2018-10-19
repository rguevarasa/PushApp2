package com.distrilluz.pushapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nroDocumento  = findViewById(R.id.etNroDocumento);
        final Button button = findViewById(R.id.btnRegistrar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                OneSignal.sendTag("nroDocumento", nroDocumento.getText().toString());

            }
        });



    }
}
