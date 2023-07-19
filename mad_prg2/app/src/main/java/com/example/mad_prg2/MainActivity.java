package com.example.mad_prg2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnDot,btnEquals,btnAdd,btnSub,btnMul,btnDiv,btnClear;
    EditText txtResult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne= (Button)findViewById(R.id.button_one);
        btnOne.setOnClickListener(this);

        btnTwo= (Button)findViewById(R.id.button_two);
        btnTwo.setOnClickListener(this);
        btnThree= (Button)findViewById(R.id.button_three);
        btnThree.setOnClickListener(this);
        btnFour= (Button)findViewById(R.id.button_four);
        btnFour.setOnClickListener(this);
        btnFive= (Button)findViewById(R.id.button_five);
        btnFive.setOnClickListener(this);
        btnSix= (Button)findViewById(R.id.button_six);
        btnSix.setOnClickListener(this);
        btnSeven= (Button)findViewById(R.id.button_seven);
        btnSeven.setOnClickListener(this);
        btnEight= (Button)findViewById(R.id.button_eight);
        btnEight.setOnClickListener(this);
        btnNine= (Button)findViewById(R.id.button_nine);
        btnNine.setOnClickListener(this);
        btnZero= (Button)findViewById(R.id.button_zero);
        btnZero.setOnClickListener(this);
        btnDot= (Button)findViewById(R.id.button_dot);
        btnDot.setOnClickListener(this);
        btnEquals= (Button)findViewById(R.id.button_equals);
        btnEquals.setOnClickListener(this);
        btnAdd= (Button)findViewById(R.id.button_plus);
        btnAdd.setOnClickListener(this);
        btnSub= (Button)findViewById(R.id.button_minus);
        btnSub.setOnClickListener(this);
        btnMul= (Button)findViewById(R.id.button_star);
        btnMul.setOnClickListener(this);
        btnDiv= (Button)findViewById(R.id.button_slash);
        btnDiv.setOnClickListener(this);
        btnClear= (Button)findViewById(R.id.button_clear);
        btnClear.setOnClickListener(this);

        txtResult=(EditText) findViewById(R.id.result);
        txtResult.setText("");

    }

    @Override
    public void onClick(View view) {

        if(view.equals(btnOne))
            txtResult.append("1");

        if(view.equals(btnTwo))
            txtResult.append("2");
        if(view.equals(btnThree))
            txtResult.append("3");
        if(view.equals(btnFour))
            txtResult.append("4");
        if(view.equals(btnFive))
            txtResult.append("5");
        if(view.equals(btnSix))
            txtResult.append("6");
        if(view.equals(btnSeven))
            txtResult.append("7");
        if(view.equals(btnEight))
            txtResult.append("8");
        if(view.equals(btnNine))
            txtResult.append("9");
        if(view.equals(btnZero))
            txtResult.append("0");
        if(view.equals(btnDot))
            txtResult.append(".");
        if(view.equals(btnAdd))
            txtResult.append("+");
        if(view.equals(btnSub))
            txtResult.append("-");
        if(view.equals(btnMul))
            txtResult.append("*");
        if(view.equals(btnDiv))
            txtResult.append("/");

        if(view.equals(btnClear))
            txtResult.setText("");


        if(view.equals(btnEquals)){
            try {
                String data=txtResult.getText().toString();

                if(data.contains("+"))
                {
                    String[] operand = data.split(Pattern.quote("+"));
                    if(operand.length==2)
                    {
                        double op1=Double.parseDouble(operand[0]);
                        double op2=Double.parseDouble(operand[1]);
                        double result=op1+op2;
                        txtResult.setText(String.valueOf(result));
                    }else{
                        Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }
                else if(data.contains("-")){
                    String[] operand = data.split(Pattern.quote("-"));
                    if(operand.length==2)
                    {
                        double op1=Double.parseDouble(operand[0]);
                        double op2=Double.parseDouble(operand[1]);
                        double result=op1-op2;
                        txtResult.setText(String.valueOf(result));
                    }else{
                        Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }
                else if(data.contains("*")){
                    String[] operand = data.split(Pattern.quote("*"));
                    if(operand.length==2)
                    {
                        double op1=Double.parseDouble(operand[0]);
                        double op2=Double.parseDouble(operand[1]);
                        double result=op1*op2;
                        txtResult.setText(String.valueOf(result));
                    }else{
                        Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }
                else if(data.contains("/")){
                    String[] operand = data.split(Pattern.quote("/"));
                    if(operand.length==2)
                    {
                        double op1=Double.parseDouble(operand[0]);
                        double op2=Double.parseDouble(operand[1]);
                        double result=op1-op2;
                        txtResult.setText(String.valueOf(result));
                    }else{
                        Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }

            }catch (Exception e){
                Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
            }
        }



    }
}