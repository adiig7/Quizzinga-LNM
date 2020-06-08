package com.example.quizzinga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
        TextView tag,app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        app = findViewById(R.id.app_name);
        tag = findViewById(R.id.tag);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        },3000);
        app.setTranslationY(-3000);
        app.animate().translationYBy(3000).setDuration(1000);
        tag.setTranslationY(3000);
        tag.animate().translationYBy(-3000).setDuration(1000);


    }


}
