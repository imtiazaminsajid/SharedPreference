package com.example.imtiazaminsajid.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText emailValue, passValue;
    Button save, retrieve, delete;
    TextView showEmail, showPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailValue = findViewById(R.id.emailValue);
        passValue = findViewById(R.id.passValue);
        save = findViewById(R.id.save);
        retrieve = findViewById(R.id.retrieve);
        delete = findViewById(R.id.delete);
        showEmail = findViewById(R.id.show_email);
        showPass = findViewById(R.id.show_pass);

        

    }

    public void saveUser(View view) {
    }

    public void showUser(View view) {
    }

    public void deleteUser(View view) {
    }
}
