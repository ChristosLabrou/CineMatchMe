package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;

public class SearchTitle extends AppCompatActivity {

    public void checkIfMovieExists(View view){
        Intent intent = new Intent(this,movieExistsPopup.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_title);
    }
}