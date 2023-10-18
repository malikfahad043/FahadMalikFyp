package com.example.second;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class drawer_consultant extends AppCompatActivity {
    private EditText editTextId;
    private DrawerLayout drawer_layout;
    private NavigationView navigation_view;

    private ImageButton btn_open_drawer;
    private Toolbar toolbar1;

    private EditText editTextName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_consultant);
        drawer_layout = findViewById(R.id.drawer_layout);
        navigation_view = findViewById(R.id.navigation_view);
        toolbar1 = findViewById(R.id.toolbar1);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer_layout, toolbar1, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation item clicks here
                return true; // Return true to indicate that the event has been handled
            }
        });

    }

}
