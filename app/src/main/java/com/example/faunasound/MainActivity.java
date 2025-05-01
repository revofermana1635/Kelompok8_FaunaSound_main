package com.example.faunasound;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView Herbivora = findViewById(R.id.button_herbivora);
        ImageView Karnivora = findViewById(R.id.button_karnivora);
        ImageView Omnivora = findViewById(R.id.button_omnivora);

        Herbivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent ke HerbivoraActivity
                Intent intent = new Intent(MainActivity.this, HerbivoraActivity.class);
                startActivity(intent);
            }
        });

        Karnivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent ke KarnivoraActivity
                Intent intent = new Intent(MainActivity.this, KarnivoraActivity.class);
                startActivity(intent);
            }
        });

        Omnivora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent ke OmnivoraActivity
                Intent intent = new Intent(MainActivity.this, OmnivoraActivity.class);
                startActivity(intent);
            }
        });
    }
}