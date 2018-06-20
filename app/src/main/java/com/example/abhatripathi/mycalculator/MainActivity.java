package com.example.abhatripathi.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1=(EditText) findViewById(R.id.inputText1);
        input2=(EditText) findViewById(R.id.inputText2);
        output=(TextView) findViewById(R.id.outputText);
    }

    public void Addition(View view) {
     int num1=Integer.parseInt(input1.getText().toString());
     int num2=Integer.parseInt(input2.getText().toString());
     int ans=num1+num2;
     output.setText(String.valueOf(ans));
    }

    public void Subtract(View view) {
        int num1=Integer.parseInt(input1.getText().toString());
        int num2=Integer.parseInt(input2.getText().toString());
        int ans=num1-num2;
        output.setText(String.valueOf(ans));
    }

    public void Multiply(View view) {
        int num1=Integer.parseInt(input1.getText().toString());
        int num2=Integer.parseInt(input2.getText().toString());
        int ans=num1*num2;
        output.setText(String.valueOf(ans));
    }

    public void Divide(View view) {
        int num1=Integer.parseInt(input1.getText().toString());
        int num2=Integer.parseInt(input2.getText().toString());
        int ans=num1/num2;
        output.setText(String.valueOf(ans));
    }
}
