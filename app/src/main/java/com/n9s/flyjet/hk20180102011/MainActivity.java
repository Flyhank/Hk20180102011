package com.n9s.flyjet.hk20180102011;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener     //implements
{
    Button btn3;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        tb = (ToggleButton) findViewById(R.id.toggleButton);
        tb.setOnClickListener(new View.OnClickListener()    //匿名類別
        {
            @Override
            public void onClick(View view)
            {
                if(tb.isChecked())
                {
                    Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "目前關閉中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void click1(View v) //兩個button內部都設為click1, 共用此method做判斷
    {
        switch(v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this, "Hi, friend!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "Hi, there!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button3:
                Toast.makeText(MainActivity.this, "Hi, Man!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void clickCheck(View v)  //此button4顯示ToggleButton的狀態
    {
        if (tb.isChecked())
        {
            Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "目前關閉中", Toast.LENGTH_SHORT).show();
        }
    }
}
