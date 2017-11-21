package com.example.awesomefat.csc250_hw13_template;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;

public class Screen2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_screen2);
        //String theName = this.getIntent().getStringExtra("myName");
        int[] ar = this.getIntent().getIntArrayExtra("myAR");
        Arrays.sort(ar);
        ViewGroup theVLL = (ViewGroup)this.findViewById(R.id.theVerticalLinearLayout);

        for(int i = 0; i < ar.length; i++)
        {
            TextView tv = new TextView(this);
            tv.setText("" + ar[i]);
            theVLL.addView(tv);
        }




    }
}
