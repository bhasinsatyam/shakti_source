package com.example.shakti_source;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.pm.PackageManager;

public class Help_line_numbers extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private TextView callText;
    public ImageView callBtn ,callBtn2,callBtn3,callBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help_line_numbers);

        callBtn = findViewById(R.id.call);
        callBtn2 = findViewById(R.id.call2);
        callBtn3 = findViewById(R.id.call3);
        callBtn4= findViewById(R.id.call4);


        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton();
            }
        });
        callBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton2();
            }
        });
        callBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton3();
            }
        });
        callBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton4();
            }
        });


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void CallButton() {
        String number = "9910988378";
        if (ContextCompat.checkSelfPermission(Help_line_numbers.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Help_line_numbers.this, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);

        } else {
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

        }
    }
    private void CallButton2() {
        String number = "9910988378";
        if (ContextCompat.checkSelfPermission(Help_line_numbers.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Help_line_numbers.this, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);

        } else {
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

        }
    }
    private void CallButton3() {
        String number = "9910988378";
        if (ContextCompat.checkSelfPermission(Help_line_numbers.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Help_line_numbers.this, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);

        } else {
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

        }
    }
    private void CallButton4() {
        String number = "9910988378";
        if (ContextCompat.checkSelfPermission(Help_line_numbers.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Help_line_numbers.this, new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_CALL);

        } else {
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton();

            } else {
                Toast.makeText(this, "permission DENIED", Toast.LENGTH_SHORT).show();
            }

        }
    }
}