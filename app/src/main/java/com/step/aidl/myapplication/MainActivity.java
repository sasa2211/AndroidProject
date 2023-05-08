package com.step.aidl.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initView(){
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            items.add("i === " + String.valueOf(i));

        }
        for (String item : items){
            System.out.println(item);
        }
    }
    private void switches(){
        int i = (int) (Math.random()*10);
        switch (i){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
    }
}