package com.abhinav.restuser;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MenuActivity extends AppCompatActivity {
    String s0,s1,s2,s3,s4,s5,s6,s7,s8,s9;
    TextView sabji1,sabji2,sabji3,dal,rice,dt,buttermilk,roti,price,lsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        sabji1=(TextView)findViewById(R.id.sabji1);
        sabji2=(TextView)findViewById(R.id.sabji2);
        sabji3=(TextView)findViewById(R.id.sabji3);
        dal=(TextView)findViewById(R.id.dal);
        rice=(TextView)findViewById(R.id.rice);
        buttermilk=(TextView)findViewById(R.id.buttermilk);
        roti=(TextView)findViewById(R.id.roti);
        price=(TextView)findViewById(R.id.price);
        lsu=(TextView)findViewById(R.id.lsu);
        dt=(TextView)findViewById(R.id.disht);
        Intent iget=getIntent();
        String name=iget.getStringExtra("key");


        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myref = mDatabase.getReference(name);
        final ProgressDialog Dialog = new ProgressDialog(MenuActivity.this);
        Dialog.setMessage("LOADING....");
        Dialog.show();
        myref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                s0=dataSnapshot.child("Sabji1").getValue().toString();
                s1=dataSnapshot.child("Sabji2").getValue().toString();
                s2=dataSnapshot.child("Sabji3").getValue().toString();
                s3=dataSnapshot.child("Roti").getValue().toString();
                s4=dataSnapshot.child("DalKhadhi").getValue().toString();
                s5=dataSnapshot.child("ButterMilk").getValue().toString();
                s6=dataSnapshot.child("Rice").getValue().toString();
                s7=dataSnapshot.child("Price").getValue().toString();
                s8=dataSnapshot.child("LastUpdate").getValue().toString();
                s9=dataSnapshot.child("DishType").getValue().toString();
                sabji1.setText(s0);
                sabji2.setText(s1);
                sabji3.setText(s2);
                rice.setText(s6);
                lsu.setText(s8);
                roti.setText(s3);
                dal.setText(s4);
                price.setText(s7);
                buttermilk.setText(s5);
                dt.setText(s9);
                Dialog.hide();
                // Toast.makeText(getApplicationContext(),s0,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
