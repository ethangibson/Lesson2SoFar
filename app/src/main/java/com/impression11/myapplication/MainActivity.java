package com.impression11.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearButton(View view){

        EditText name = (EditText) findViewById(R.id.formName);
        EditText email = (EditText) findViewById(R.id.formEmail);
        EditText message = (EditText) findViewById(R.id.formMessage);

        name.setText("");
        email.setText("");
        message.setText("");

        Toast.makeText(this, "Fields have been cleared",Toast.LENGTH_SHORT).show();

    }

}
