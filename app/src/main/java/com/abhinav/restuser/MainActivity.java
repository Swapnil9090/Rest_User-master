package com.abhinav.restuser;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7;
    String lu1,lu2,lu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.hotel1);
        t2=(TextView)findViewById(R.id.hotel2);
        t3=(TextView)findViewById(R.id.hotel3);
        t4=(TextView)findViewById(R.id.hotel4);
        t5=(TextView)findViewById(R.id.hotel5);
        t6=(TextView)findViewById(R.id.hotel6);
        t7=(TextView)findViewById(R.id.hotel7);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","pramukh");
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","JayMataraniKhanaKhajana");
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","shrinivas");
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","mataranidhaba");
                startActivity(i);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","Restname909");
                startActivity(i);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","HM");
                startActivity(i);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                i.putExtra("key","HM(PUNJABI)");
                startActivity(i);
            }
        });
    }
}
