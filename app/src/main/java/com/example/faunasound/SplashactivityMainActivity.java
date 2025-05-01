package com.example.faunasound;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashactivityMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashmain);

        // Delay untuk menampilkan splash screen selama 3 detik (3000 ms)
        new Handler().postDelayed(() -> {
            // Pindah ke MainActivity setelah delay
            Intent intent = new Intent(SplashactivityMainActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Tutup SplashActivity

        }, 2000); // Tambahkan 2000 disini untuk delay 2 detik (2000 ms)
    }
}