package com.example.smith.zhiqiangtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private android.widget.Button button0;
    private android.widget.Button button1;
    private android.widget.Button button2;
    private android.widget.Button button3;
    private android.widget.Button button4;
    private android.widget.Button button5;
    private android.widget.Button button6;
    private android.widget.Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button7 = (Button) findViewById(R.id.button7);
        this.button6 = (Button) findViewById(R.id.button6);
        this.button5 = (Button) findViewById(R.id.button5);
        this.button4 = (Button) findViewById(R.id.button4);
        this.button3 = (Button) findViewById(R.id.button3);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button1 = (Button) findViewById(R.id.button1);
        this.button0 = (Button) findViewById(R.id.button0);
    }


    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void setListener() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button0:
                break;
            case R.id.button1:
                break;
            case R.id.button2:
                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;
            case R.id.button6:
                break;
            case R.id.button7:
                break;
            default:
                break;
        }

    }


}
