package com.example.mad_prg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    EditText username,password;
    Button btnSignIn;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username=findViewById(R.id.Username);
        password=findViewById(R.id.Password);
        btnSignIn=findViewById(R.id.signIn);

        Bundle bundle=getIntent().getExtras();

        String uname=bundle.getString("username");
        String pwd=bundle.getString("password");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals(uname) && pass.equals(pwd))
                {
                    Toast.makeText(SignIn.this,"Success",Toast.LENGTH_SHORT).show();
                }
                else {
                    count++;
                    if(count>=3) {
                        btnSignIn.setEnabled(false);
                    }
                    else {
                        Toast.makeText(SignIn.this, "Fail", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}