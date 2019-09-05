package com.img.miraj;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.sumry:
                    Dashboard blankFragment = new Dashboard();
                    // create a FragmentManager
                    FragmentManager fm = getSupportFragmentManager();
                    fm.beginTransaction()
                            .replace(R.id.fragment_container, blankFragment)
                            .commit();
                    return true;
                case R.id.credit:
                    credit cr = new credit();
                    // create a FragmentManager
                    FragmentManager f = getSupportFragmentManager();
                    f.beginTransaction()
                            .replace(R.id.fragment_container, cr);
                    return true;
                case R.id.debit:
                    Debit debit = new Debit();
                    // create a FragmentManager
                    FragmentManager db = getSupportFragmentManager();
                    db.beginTransaction()
                            .replace(R.id.fragment_container, debit);
                    return true;
                case R.id.transaction:
                    Transaction transaction = new Transaction();
                    // create a FragmentManager
                    FragmentManager tr = getSupportFragmentManager();
                    tr.beginTransaction()
                            .replace(R.id.fragment_container, transaction);
                    return true;
                case R.id.alert:
                    Alerts alert = new Alerts();
                    // create a FragmentManager
                    FragmentManager al = getSupportFragmentManager();
                    al.beginTransaction()
                            .replace(R.id.fragment_container, alert);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
