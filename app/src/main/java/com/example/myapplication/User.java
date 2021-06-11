package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class User extends Fragment {
    Queries q;
    int Id;
    Chat Chats[];
    User Friends[];
    Subscription Subscription;
    int Renown;
    Statistics Statistics;

    public void setChats(Chat[] chats) {
        this.Chats = chats;
    }
    public Chat[] getChats() {
        return this.Chats;
    }

    public void setLocation(Subscription subscription) {
        this.Subscription = subscription;
    }
    public Subscription getSubscription() {
        return this.Subscription;
    }

    public void setFriends(User[] friends) {
        this.Friends = friends;
    }
    public User[] getFriends() {
        return this.Friends;
    }

    public void setRenown(int renown) {
        this.Renown = renown;
    }
    public int getRenown() {
        return this.Renown;
    }

    public void setStatistics(Statistics statistics) { this.Statistics = statistics; }
    public Statistics getStatistics() {
        return this.Statistics;
    }

    public boolean register(String firstName,String lastName,String email, String password){
        String query ="registerUser("+firstName+","+lastName+","+email+","+password+")";
        try{
            q.executeQuery(query);
            return true;
        }catch(Exception e){
            return false;
        }

    }
    public boolean addFriend(User me,User newFriend){
        String query ="registerUser("+me+","+newFriend+")";
        try{
            q.executeQuery(query);
            return true;
        }catch(Exception e){
            return false;
        }

    }
    public boolean removeFriend(User me,User newFriend){
        String query ="removeFriend("+me+","+newFriend+")";
        try{
            q.executeQuery(query);
            return true;
        }catch(Exception e){
            return false;
        }

    }
    public boolean addMovie(String movieTitle){
        String query ="suggestMovie("+movieTitle+")";
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

        view.findViewById(R.id.getin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(User.this)
                        .navigate(R.id.action_login_to_swiping);
            }
        });
    }
}