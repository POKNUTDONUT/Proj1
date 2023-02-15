package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num1;
private EditText num2;
private Button add;
private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // MAKE INT //
        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        add = (Button) findViewById(R.id.btnadd);
        answer =(TextView) findViewById(R.id.txtresult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myNum1 = Integer.parseInt(num1.getText().toString());
                int myNum2 = Integer.parseInt(num2.getText().toString());
                int sum = myNum1 + myNum2;
                answer.setText("Answer :" + sum);

            }
        });
    }
}