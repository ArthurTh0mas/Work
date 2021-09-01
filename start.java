package com.ng.ng8eke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mBtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1ClickMethod();
            }
        });
        findViewById(R.id.mBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2ClickMethod();
            }
        });
    }

    @CalculateTime
    private void btn1ClickMethod() {
        println("Click1");
       //try {
       //    Thread.sleep(100);
       //} catch (Exception e) {
       //    e.printStackTrace();
       //}

    }

    @TestASM
    private void btn2ClickMethod() {
        println("Click2");
    }

    public void println(String s) {
        System.out.println(s);
    }
}
