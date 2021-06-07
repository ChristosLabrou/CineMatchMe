package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;

import com.google.android.material.snackbar.Snackbar;

public class SearchTitle extends AppCompatActivity {

    public void checkIfMovieExists(View view){
        //make call to DB and find if it exists
        boolean exists = new Boolean(false);
        if(exists){
            Snackbar.make(findViewById(R.id.myCoordinatorLayout), "This Movie Already Exists!",
                    Snackbar.LENGTH_SHORT)
                    .show();
        } else {
            Intent intent = new Intent(this,addMovieForm.class);
            startActivity(intent);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_title);
    }
}