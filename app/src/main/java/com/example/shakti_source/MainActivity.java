package com.example.shakti_source;



import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

     ImageView sosBtn;
    ImageView tutorialBtn;
     ImageView helplineBtn;
    ImageView aboutusBtn;
    FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyActivity", "onCreate: called"); // Log entry for onCreate()
//        FirebaseApp.initializeApp(getApplicationContext());
//        mAuth = FirebaseAuth.getInstance();
//        user = mAuth.getCurrentUser();
//        if (user == null){
//            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//            startActivity(intent);
//            finish();
//        }
        setContentView(R.layout.activity_main);
        tutorialBtn = findViewById(R.id.tutorialbtn);

        tutorialBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), self_defence_tutorial.class);
                startActivity(intent);
                finish();
            }
        });

        sosBtn = findViewById(R.id.sos_alert);

        sosBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), sos_alert.class);
                startActivity(intent);
                finish();
            }
        });
        aboutusBtn = findViewById(R.id.Aboutus);

        aboutusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Aboutus.class);
                startActivity(intent);
                finish();
            }
        });

        helplineBtn = findViewById(R.id.helpline_numbers);

        helplineBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Help_line_numbers.class);
                startActivity(intent);
                finish();
            }
        });

    }}


//    public void PopupMenu(View view) {
//        PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
//        popupMenu.getMenuInflater().inflate(R.menu.popuph,popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Intent intent = new Intent(getApplicationContext(), Multi_Lnaguage.class);
//                startActivity(intent);
//                finish();
//
//
//                return true;
//            }
//        });
//        popupMenu.show();
//    }

//}