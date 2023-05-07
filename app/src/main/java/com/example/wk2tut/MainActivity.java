package com.example.prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    final String title = "wk2 Practical";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.Theme_Prac);
        Log.v(title,"Started the app!");

    }

    @Override
    protected void  onResume(){
        super.onResume();
        // load in a User?
        User myUser = new User("name","Title",1,false);
        // set up listener for the button
        Button follow =findViewById(R.id.follow);
        Log.v(title,"press the button!");
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myUser.followed == false){
                    myUser.followed = true;
                    follow.setText("Followed");
                    Log.v(title, "Changed");
                }
                else{
                    myUser.followed = false;
                    follow.setText("Follow");
                }
            }
        });

    }
}

