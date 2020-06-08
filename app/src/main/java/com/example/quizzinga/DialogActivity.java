package com.example.quizzinga;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DialogActivity extends AppCompatActivity {
    ImageView insta_dialog,linkedin,github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer);

        insta_dialog = findViewById(R.id.insta_dialog);
        linkedin = findViewById(R.id.linkedin);
        github = findViewById(R.id.github);

        insta_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri1= Uri.parse("http://instagram.com/_u/adiig7");
                Intent insta = new Intent(Intent.ACTION_VIEW,uri1);
                insta.setPackage("com.instagram.android");

                try {
                    startActivity(insta);
                } catch (ActivityNotFoundException e) {

                    Toast.makeText(DialogActivity.this,"Instagram Not Installed!", Toast.LENGTH_LONG).show();
                }
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/aditya-gupta-056780197/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/adiig7");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}