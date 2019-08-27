package com.example.activity_tasks_stacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void act_a(View v)
    {
        startActivity(new Intent(this,MainActivity.class));

    }
    public void act_b(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }
    public void act_c(View view)
    {
        startActivity(new Intent(this,Main3Activity.class));
    }
    public void act_d(View view)
    {
        startActivity(new Intent(this,Main4Activity.class));
    }
}
