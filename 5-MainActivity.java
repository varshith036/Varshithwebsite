package com.example.checkboxapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBoxJava = findViewById(R.id.checkBoxJava);
        CheckBox checkBoxPython = findViewById(R.id.checkBoxPython);
        CheckBox checkBoxC = findViewById(R.id.checkBoxC);
        Button submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Selected: ");

                if (checkBoxJava.isChecked())
                    result.append("Java ");

                if (checkBoxPython.isChecked())
                    result.append("Python ");

                if (checkBoxC.isChecked())
                    result.append("C++ ");

                if (result.toString().equals("Selected: "))
                    result.append("None");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();

                submitButton.setEnabled(false);
                new android.os.Handler().postDelayed(() ->
                        submitButton.setEnabled(true), 1000);
            }
        });
    }
}
