package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityAddMovieFormBinding;

public class addMovieForm extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityAddMovieFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAddMovieFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        setSupportActionBar(binding.toolbar);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_add_movie_form);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_add_movie_form);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void sendAddMovieRequest(View view){
        Snackbar.make(findViewById(R.id.myCoordinatorLayout), "The Request has been sent to an Admin",
                Snackbar.LENGTH_SHORT)
                .show();
    }
}