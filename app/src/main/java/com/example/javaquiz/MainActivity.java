package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {  "java is a person",
                                    "java was introduced in 1995",
                                    "java was invented by Brendan Eich",
                                    "java has abstract class",
                                    "java support interface",
                                    "java is used for making apps" };
    private boolean[] ans = {false,true,false,true,true,true};
    private int score=0,index=0;
    Button Yes;
    Button No;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.button);
        No = findViewById(R.id.button2);
        textView2=findViewById(R.id.textView2);
        textView2.setText(questions[index]);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(ans[index]) score++;
                    index++;
                    if (index <= questions.length-1){
                        textView2.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Restart App", Toast.LENGTH_SHORT).show();
                }
            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(!ans[index]) score++;
                    index++;
                    if (index <= questions.length-1){
                        textView2.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Please Restart App", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}