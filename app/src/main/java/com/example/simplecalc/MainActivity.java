package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.bt1);
        Button b2=(Button) findViewById(R.id.bt2);
        Button b3=(Button) findViewById(R.id.bt3);
        Button b4=(Button) findViewById(R.id.bt4);
        TextView tv1=(TextView) findViewById(R.id.tview1);
        TextView tv2=(TextView) findViewById(R.id.tview2);
        TextView tv3=(TextView) findViewById(R.id.tview3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.valueOf(tv1.getText().toString());
                int num2=Integer.valueOf(tv2.getText().toString());
                tv3.setText(""+(num1+num2));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num5=Integer.valueOf(tv1.getText().toString());
                int num6=Integer.valueOf(tv2.getText().toString());
                tv3.setText(""+(num5-num6));

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num7=Integer.valueOf(tv1.getText().toString());
                int num8=Integer.valueOf(tv2.getText().toString());
                tv3.setText(""+(num7*num8));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num3=Float.valueOf(tv1.getText().toString());
                float num4=Float.valueOf(tv2.getText().toString());
                tv3.setText(""+(num3/num4));
            }
        });


    }
}
