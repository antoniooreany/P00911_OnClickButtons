package com.antoniooreany.myapplicationp00911_onclickbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "myFirstLogs";
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                textView.setText(R.string.button_1_clicked);
                Log.d(TAG, "button_1_clicked");
                break;
            case R.id.button2:
                textView.setText(R.string.button_2_clicked);
                Log.d(TAG, "button_2_clicked");
                break;
            case R.id.button3:
                textView.setText(R.string.button_3_clicked);
                Log.d(TAG, "button_3_clicked");
                break;
        }
    }
}

