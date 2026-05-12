package com.example.navigationdrawer;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar generee par le template Navigation Drawer
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // DrawerLayout
        drawer = findViewById(R.id.drawer_layout);

        // NavigationView
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Bouton hamburger pour ouvrir et fermer le menu lateral
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // Afficher Fragment 1 au demarrage
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment())
                    .commit();

            navigationView.setCheckedItem(R.id.nav_fragment1);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_fragment1) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment())
                    .commit();

        } else if (id == R.id.nav_fragment2) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new BlankFragment2())
                    .commit();

        } else if (id == R.id.nav_list) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu, new FragmentList())
                    .commit();
        }

        // Fermer le drawer apres le clic
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {

        // Si le drawer est ouvert, le fermer
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
