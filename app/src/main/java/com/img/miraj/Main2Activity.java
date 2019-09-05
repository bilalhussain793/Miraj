package com.img.miraj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
                    Credit cr = new Credit();
                    // create a FragmentManager
                    FragmentManager f = getSupportFragmentManager();
                    f.beginTransaction()
                            .replace(R.id.fragment_container, cr)
                            .commit();
                    return true;
                case R.id.debit:
                    Debit debit = new Debit();
                    // create a FragmentManager
                    FragmentManager db = getSupportFragmentManager();
                    db.beginTransaction()
                            .replace(R.id.fragment_container, debit).commit();
                    return true;
                case R.id.transaction:
                    Transaction transaction = new Transaction();
                    // create a FragmentManager
                    FragmentManager tr = getSupportFragmentManager();
                    tr.beginTransaction()
                            .replace(R.id.fragment_container, transaction).commit();
                    return true;
                case R.id.alert:
                    Alerts alert = new Alerts();
                    // create a FragmentManager
                    FragmentManager al = getSupportFragmentManager();
                    al.beginTransaction()
                            .replace(R.id.fragment_container, alert).commit();
                    return true;
            }
            return false;
        }
    };
    ImageView addperson,search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);

                addperson=findViewById(R.id.add_p);
        addperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,AddPerson.class));
                Toast.makeText(Main2Activity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

        Dashboard blankFragment = new Dashboard();
        // create a FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragment_container, blankFragment)
                .commit();
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
