package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class Review extends Fragment {

    int id;
    User Author;
    Movie About;
    int Overall_rating;
    String Text;

    public void setAuthor(User author) {
        this.Author = author;
    }
    public User getAuthor() {
        return this.Author;
    }

    public void setAbout(Movie movie) {
        this.About = movie;
    }
    public Movie getAbout() {
        return this.About;
    }

    public void setText(String text) {
        this.Text = text;
    }
    public String getText() {
        return this.Text;
    }

    public void setOverall_rating(int rating) {
        this.Overall_rating = rating;
    }
    public int getOverall_rating() {
        return this.Overall_rating;
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