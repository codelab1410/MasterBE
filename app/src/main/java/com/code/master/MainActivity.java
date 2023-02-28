package com.code.master;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity {

    private ShapeableImageView toastShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        toastShow = (ShapeableImageView) findViewById(R.id.toastShow);
        toastShow.setOnClickListener(v -> Toast.makeText(MainActivity.this, "" + getResources().getString(R.string.app_name), Toast.LENGTH_SHORT).show());
    }
}