package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    private MaterialButtonToggleGroup btnGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGroup = findViewById(R.id.toggleButton);

        btnGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {

                switch (checkedId)
                {
                    case R.id.button1:

                        Toast.makeText(MainActivity.this, "Favorite", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.button2:

                        Toast.makeText(MainActivity.this, "Red Eye", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.button3:

                        Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });
    }
}