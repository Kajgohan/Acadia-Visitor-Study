package com.example.acadiavisitorstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

    }

    public void onDone(View view) {
        finish();
    }
}
