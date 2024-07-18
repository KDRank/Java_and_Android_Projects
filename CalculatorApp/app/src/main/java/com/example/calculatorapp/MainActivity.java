package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView symDivide, symMultiply, symAdd, symSubtract, setSym, equals, answer;
    private EditText num1, num2;
    boolean divides = false, multiplies = false, subtracts = false, adds = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        symDivide = findViewById(R.id.symDivide);
        symMultiply = findViewById(R.id.symMultiply);
        symAdd = findViewById(R.id.symAdd);
        symSubtract = findViewById(R.id.symSubtract);
        setSym = findViewById(R.id.setSym);
        equals = findViewById(R.id.equals);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        answer = findViewById(R.id.answer);

        symDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divides = true;
                multiplies = false;
                adds = false;
                subtracts = false;
                setSym.setText("%");
            }
        });
        symMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplies = true;
                divides = false;
                adds = false;
                subtracts = false;
                setSym.setText("x");
            }
        });
        symAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adds = true;
                divides = false;
                multiplies = false;
                subtracts = false;
                setSym.setText("+");
            }
        });
        symSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtracts = true;
                divides = false;
                multiplies = false;
                adds = false;
                setSym.setText("-");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Integer.parseInt(num1.getText().toString());
                double number2 = Integer.parseInt(num2.getText().toString());

                if(divides){
                    double divAns = number1/number2;
                    answer.setText(String.valueOf(divAns));
                }else if(multiplies){
                    double multAns = number1*number2;
                    answer.setText(String.valueOf(multAns));
                }else if(adds){
                    double addAns = number1+number2;
                    answer.setText(String.valueOf(addAns));
                }else if(subtracts){
                    double subtAns = number1-number2;
                    answer.setText(String.valueOf(subtAns));

                }
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
    }
}