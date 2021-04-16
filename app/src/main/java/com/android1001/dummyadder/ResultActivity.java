package com.android1001.dummyadder;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    public static final String KEY_FIRST_NUMBER = "FIRST_NUMBER";
    public static final String KEY_SECOND_NUMBER = "SECOND_NUMBER";

    private TextView resultView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultView = findViewById(R.id.result);
        String firstNumber = getIntent().getStringExtra(KEY_FIRST_NUMBER);
        String secondNumber = getIntent().getStringExtra(KEY_SECOND_NUMBER);
        String result = addThem(firstNumber, secondNumber);
        resultView.setText(result);
    }

    /**
     * Add the two numbers firstNumber and secondNumber together. For example, if firstNumber="123"
     * and secondNumber="4312", the method should return "4435". Both inputs are positive integers.
     * If the input is invalid, the method should return empty string "". Do not use
     * java.math.BigInteger.
     */
    private String addThem(String firstNumber, String secondNumber) {
        return "";
    }
}
