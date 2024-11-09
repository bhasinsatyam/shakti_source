package com.example.shakti_source;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText uID, uPassword;
    Button signUpBtn;
    TextView logIn;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(getApplicationContext(), sos_alert.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_signup);
        mAuth = FirebaseAuth.getInstance();
        uID = findViewById(R.id.UserID);
        uPassword = findViewById(R.id.Password);
        signUpBtn = findViewById(R.id.button);
        logIn = findViewById(R.id.GoToLogIn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User_ID = uID.getText().toString();
                String User_Password = uPassword.getText().toString();
                if (User_ID.isEmpty() || User_Password.isEmpty()){
                    Toast.makeText(SignupActivity.this, "Authentication failed. Fields cannot be empty.", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(User_ID, User_Password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, display a message to the user.
                                        FirebaseUser currentUser = mAuth.getCurrentUser();
                                        if (currentUser != null){
//                                            currentUser.sendEmailVerification();
                                            Toast.makeText(SignupActivity.this, "Authentication successful. Your account is created.", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(getApplicationContext(),sos_alert.class);
                                            startActivity(intent);
                                            finish();
                                        }
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        String errorMessage = task.getException() != null ? task.getException().getMessage() : "Authentication failed.";
                                        Toast.makeText(SignupActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
   });
}
}