package com.example.chatter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    EditText uName,uEmail,uPassword;
    FirebaseAuth fauth;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        uName = findViewById(R.id.name);
        uEmail = findViewById(R.id.email);
        uPassword = findViewById(R.id.password);
        btn = findViewById(R.id.signup);

        fauth = FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = uEmail.getText().toString();
                String password = uPassword.getText().toString();

                if(TextUtils.isEmpty(mail)){
                    uEmail.setError("Email is required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    uPassword.setError("Password is required");
                    return;
                }
                if(password.length()<6){
                    uPassword.setError("Password should be more than or equal to 6 characters");
                    return;
                }

                fauth.createUserWithEmailAndPassword(mail, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(SignUpActivity.this,"Successful",Toast.LENGTH_LONG).show();
                                    Intent i = new Intent(SignUpActivity.this,MainActivity.class);
                                    startActivity(i);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
            }
        });
    }
}