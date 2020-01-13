package com.example.ingsw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name= (EditText) findViewById(R.id.etName);
        Password= (EditText) findViewById(R.id.etPass);
        Login= (Button) findViewById(R.id.etLogin);
    }
    public EditText getName(){
        return Name;
    }
    public EditText getPass(){
        return Password;
    }
    private void valdate (String userName, String userPass){
        if((userName== "admin") && (userPass == "1234")){
            Intent intent = new Intent (login.this, altro.class);
            startActivity (intent);
        }

    }
}


