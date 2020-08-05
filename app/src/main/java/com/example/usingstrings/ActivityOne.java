package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    TextView txtView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(tag: "Lifecycle",msg: "Oncreate() invoked");
        setContentView(R.layout.activity_one);
        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);
    }
    
    public void onStart(){
        super.onStart();
        Log.i(tag: "Lifecycle",msg: "Oncreate() invoked");
    }
    public void onRestart(){
        super.onRestart();
        Log.i(tag: "Lifecycle",msg: "Oncreate() invoked");
    }
    public void onResume(){
        super.onResume();
        Log.i(tag: "Lifecycle",msg: "Oncreate() invoked");
    }
}