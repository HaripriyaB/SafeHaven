package com.example.safehaven;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.safehaven.ui.chat.ChatFragment;
import com.example.safehaven.ui.complaints.ComplaintsFragment;
import com.example.safehaven.ui.sos.SosFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_sos:
                        openFragment(new SosFragment());
                        return true;
                    case R.id.navigation_complaints:
                        openFragment(new ComplaintsFragment());
                        return true;
                    case R.id.navigation_chat:
                        openFragment(new ChatFragment());
                        return true;
                }
                return false;
            }
        });
        if (savedInstanceState == null) {
            navView.setSelectedItemId(R.id.navigation_sos);
        }
    }

}
