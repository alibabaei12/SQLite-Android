 package com.example.slugbooks.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

     MyDb db;
     EditText firstname;
     EditText lastname;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         db = new MyDb(this, "names", null, 1);
         firstname = findViewById(R.id.firstNameID);
         lastname = findViewById(R.id.lastNameId);
     }

     public void insert(View view) {
         String s1 = firstname.getText().toString();
         String s2 = lastname.getText().toString();
         db.insert(s1, s2);
     }

     public void delete(View view) {
         String s = firstname.getText().toString();
         db.delete(s);
     }

     public void view(View view) {
         db.getAll();
     }

     public void update(View view) {
         String s1 = firstname.getText().toString();
         String s2 = lastname.getText().toString();
         db.update(s1, s2);
     }
 }
