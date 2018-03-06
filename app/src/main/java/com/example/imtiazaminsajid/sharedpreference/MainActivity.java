package com.example.imtiazaminsajid.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailValue, passValue;
    Button save, retrieve, delete;
    TextView showEmail, showPass;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

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

        sharedPreferences = getSharedPreferences("User Authentication", MODE_PRIVATE);
        editor = sharedPreferences.edit();



    }

    public void saveUser(View view) {
        String email = emailValue.getText().toString();
        String pass = passValue.getText().toString();
        editor.putString("email", email);
        editor.putString("pass", pass);
        editor.commit();
        Toast.makeText(this, "Email & Password Saved", Toast.LENGTH_SHORT).show();
    }

    public void showUser(View view) {
        showEmail.setText(sharedPreferences.getString("email", "No email Entry"));
        showPass.setText(sharedPreferences.getString("pass", "No Password Entry"));
    }

    public void deleteUser(View view) {
        editor.clear();
        editor.commit();
        Toast.makeText(this, "Email And Password Delete", Toast.LENGTH_SHORT).show();
    }
}
