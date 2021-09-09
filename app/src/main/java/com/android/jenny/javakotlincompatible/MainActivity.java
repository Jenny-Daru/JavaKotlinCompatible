package com.android.jenny.javakotlincompatible;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.javakotlincompatible.HelloKt;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.text);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            tvText.setText(HelloKt.formatMessage("Android with kotlin"));
        }
    }
}

