package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class Movie extends Fragment {

    int Id;
    String Title;
    String Actors[];
    String Plot;
    String Key;
    String Genre[];

    public void setTitle(String newTitle) {
        this.Title = newTitle;
    }
    public String getTitle() {
        return this.Title;
    }

    public void setActors(String[] updateActors) {
        this.Actors = updateActors;
    }
    public String[] getLog() {
        return this.Actors;
    }

    public void setPlot(String plot) { this.Plot = plot; }
    public String getPlot() {
        return this.Plot;
    }

    public void setKey(String newKey) {
        this.Key = newKey;
    }
    public String getKey() {
        return this.Key;
    }

    public void setGenre(String[] newGenre) {
        this.Genre = newGenre;
    }
    public String[] getGenre() {
        return this.Genre;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }
}

