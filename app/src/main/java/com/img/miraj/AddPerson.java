package com.img.miraj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AddPerson extends AppCompatActivity {
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private Button plus, subtract, divide, multiply, plusMinus;
    private Button ac, percent, dot, double_zero, equal;
    private String currentDisplayedInput = "";
    private String inputToBeParsed = "";
    private TextView outputResult;
    private Calculator mCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
    }
}
