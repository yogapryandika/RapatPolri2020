package com.example.rapatpolri2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    public NavController navController;

    public AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupNavigation();
    }

    private void setupNavigation() {
        drawerLayout = findViewById(R.id.drawer_layout);
        final Set<Integer> topLevelDestinations = new ArraySet<>();
        topLevelDestinations.add(R.id.session_fragment);
        topLevelDestinations.add(R.id.about_fragment);
        topLevelDestinations.add(R.id.announcement_fragment);
        topLevelDestinations.add(R.id.floormap_fragment);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        appBarConfiguration = new AppBarConfiguration.Builder(topLevelDestinations).setDrawerLayout(drawerLayout).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(this.<NavigationView>findViewById(R.id.nav_view),navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
