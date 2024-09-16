package com.example.hagk01;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;




public class Subactivity extends AppCompatActivity {

    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  // Gọi super.onCreate
        setContentView(R.layout.activity_subactivity);  // Thiết lập layout

        btnok = findViewById(R.id.btnok);  // Tham chiếu tới Button với ID "btnok"

        // Đặt sự kiện khi bấm nút
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // Đóng activity
            }
        });
    }
}
