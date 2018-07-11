package com.example.lenovo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(),"Button Clicked");*/
                Toast.makeText(getApplicationContext(), "STRING MESSAGE", Toast.LENGTH_LONG).show();
            }
        });
        Log.d("State is:","onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.d( "State is: ", "onStart");
    }

    protected void onPause() {
        super.onPause();
        Log.d( "State is: ", "onPause");
    }

    protected void  onResume()
    {
        super.onResume();
        Log.d("State is:","onResume");
    }

    protected void onStop()
    {
        super.onStop();
        Log.d("State is:","onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("State is:","onDestroy");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("State is:","onRestart");
    }
}