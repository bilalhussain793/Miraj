package com.img.miraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.etUsername);
        et2=findViewById(R.id.etPassword);
        bt=findViewById(R.id.btn_sbs);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("admin")&&et2.getText().toString().equals("1234"))
                {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));

                }
                else {
                    Toast.makeText(MainActivity.this, "Enter Valid Authorization", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}
