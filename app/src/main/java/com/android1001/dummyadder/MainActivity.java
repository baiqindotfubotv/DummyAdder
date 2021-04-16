package com.android1001.dummyadder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberText;
    private EditText secondNumberText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberText = findViewById(R.id.first_number);
        secondNumberText = findViewById(R.id.second_number);
        addButton = findViewById(R.id.add);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumber = firstNumberText.getText().toString();
                String secondNumber = secondNumberText.getText().toString();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra(ResultActivity.KEY_FIRST_NUMBER, firstNumber);
                intent.putExtra(ResultActivity.KEY_SECOND_NUMBER, secondNumber);
                startActivity(intent);
            }
        });
    }
}
