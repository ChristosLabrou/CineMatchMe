package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class Places extends Fragment {
    Queries q;
    int Id;
    String Name;
    String Location;
    Movie Current_movies[];

    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return this.Name;
    }

    public void setLocation(String location) {
        this.Location = location;
    }
    public String getLocation() {
        return this.Location;
    }

    public void setCurrent_movies(Movie[] updatedMovieList) {
        this.Current_movies = updatedMovieList;
    }
    public Movie[] getCurrent_movies() {
        return this.Current_movies;
    }

    public boolean getPlaces(){
        String query = "getPlaces()";
        try{
            q.executeQuery(query);
            return true;
        }catch(Exception e){
            return false;
        }
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