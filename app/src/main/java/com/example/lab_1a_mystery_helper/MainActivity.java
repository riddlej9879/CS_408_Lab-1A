package com.example.lab_1a_mystery_helper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lab_1a_mystery_helper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String[] helpArray = getResources().getStringArray(R.array.helpTextArray);
        Random rand = new Random();

        binding.helpButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView t = binding.helpTextOutput;
                t.setText(helpArray[rand.nextInt(helpArray.length)]);
            }
        });
    }
}