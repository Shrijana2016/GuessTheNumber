package com.example.shrij.guessthenumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void onGuess(View view){
        EditText num = (EditText)findViewById(R.id.editText);
        Toast.makeText(MainActivity.this, num.getText().toString(), Toast.LENGTH_SHORT).show();
        int guess = Integer.parseInt(num.getText().toString());
        if (guess > n ){
            makeToast("Guess lower");
        }
        else if (guess < n){
            makeToast("Guess higher");
        }
        else{

            makeToast("You made the right guess! Guess again.");
            Random rand = new Random();
             n = rand.nextInt(20)+ 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
         n = rand.nextInt(20)+ 1;

    }
}
