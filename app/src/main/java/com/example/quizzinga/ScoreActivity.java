package com.example.quizzinga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ScoreActivity extends AppCompatActivity {

    TextView score1,score2,score3,score4,score5,score6,score7,score8;
    DatabaseReference reference,title;
    TextView event_score;
    ImageView back;
    RelativeLayout teams,lyt1,lyt2,lyt3,lyt4,lyt5,lyt6,lyt7,lyt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        reference = FirebaseDatabase.getInstance().getReference("Scores");
        event_score = findViewById(R.id.event_score);
        title = FirebaseDatabase.getInstance().getReference("Title");
        back = findViewById(R.id.back);
        teams = findViewById(R.id.teams);

        event_score.setTranslationX(-1000);
        event_score.animate().translationXBy(1000).setDuration(1000);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScoreActivity.this,MainActivity.class));
            }
        });
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        event_score.startAnimation(anim);

        score1 = findViewById(R.id.score1);
        score2 = findViewById(R.id.score2);
        score3 = findViewById(R.id.score3);
        score4 = findViewById(R.id.score4);
        score5 = findViewById(R.id.score5);
        score6 = findViewById(R.id.score6);
        score7 = findViewById(R.id.score7);
        score8 = findViewById(R.id.score8);

        lyt1 = findViewById(R.id.lyt1);
        lyt2 = findViewById(R.id.lyt2);
        lyt3 = findViewById(R.id.lyt3);
        lyt4 = findViewById(R.id.lyt4);
        lyt5 = findViewById(R.id.lyt5);
        lyt6 = findViewById(R.id.lyt6);
        lyt7 = findViewById(R.id.lyt7);
        lyt8 = findViewById(R.id.lyt8);

        final DatabaseReference team1 = reference.child("Team1");
        team1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score1.setText(value_1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        final DatabaseReference team2 = reference.child("Team2");
        team2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score2.setText(value_1);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        final DatabaseReference team3 = reference.child("Team3");
        team3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score3.setText(value_1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        final DatabaseReference team4 = reference.child("Team4");
        team4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score4.setText(value_1);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        final DatabaseReference team5 = reference.child("Team5");
        team5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score5.setText(value_1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });


        final DatabaseReference team6 = reference.child("Team6");
        team6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                if (value_1 != null && !value_1.equals("")) {
                    score6.setText(value_1);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });


        final DatabaseReference team7 = reference.child("Team7");
        team7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange (@NonNull DataSnapshot dataSnapshot){
                String value_1 = dataSnapshot.getValue(String.class);
                score7.setText(value_1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError){
            }
        });

        final DatabaseReference team8 = reference.child("Team8");
        team8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value_1 = dataSnapshot.getValue(String.class);
                score8.setText(value_1);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });


    }

    @Override
    protected void onStart(){
        title.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String c = dataSnapshot.getValue(String.class);
                if (c!=null && !c.equals("")) {
                    event_score.setText(c);
                }else{
                    event_score.setText("");
                    Toast.makeText(ScoreActivity.this,"Oops!! There isn't any event going on right now.",Toast.LENGTH_SHORT).show();
                }
                }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        lyt2.setTranslationX(-1000);
        lyt2.animate().translationXBy(1000).setDuration(1000);
        lyt4.setTranslationX(-1000);
        lyt4.animate().translationXBy(1000).setDuration(1000);
        lyt6.setTranslationX(-1000);
        lyt6.animate().translationXBy(1000).setDuration(1000);
        lyt8.setTranslationX(-1000);
        lyt8.animate().translationXBy(1000).setDuration(1000);
        lyt1.setTranslationX(1000);
        lyt1.animate().translationXBy(-1000).setDuration(1000);
        lyt3.setTranslationX(1000);
        lyt3.animate().translationXBy(-1000).setDuration(1000);
        lyt5.setTranslationX(1000);
        lyt5.animate().translationXBy(-1000).setDuration(1000);
        lyt7.setTranslationX(1000);
        lyt7.animate().translationXBy(-1000).setDuration(1000);
        super.onStart();
    }
}
