package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


public class Chat extends Fragment {

    int Id;
    User participants[];
    String Log;
    String SharedMedia[];
    String Connection;

    public void setParticipants(User extraUser) {
        this.participants[this.participants.length] = extraUser;
    }
    public User[] getParticipants() {
        return this.participants;
    }

    public void setLog(String updatedLog) {
        this.Log = updatedLog;
    }
    public String getLog() {
        return this.Log;
    }

    public void setSharedMedia(String updatedMedia) {
        this.SharedMedia[this.SharedMedia.length] = updatedMedia;
    }
    public String[] getSharedMedia() {
        return this.SharedMedia;
    }

    public void setConnection(String newConnection) {
        this.Connection = newConnection;
    }
    public String[] getConnection() {
        return this.SharedMedia;
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