package com.example.hw61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textCalculate;
    Button zeroBtn;
    Button pointBtn;
    Button oneBtn;
    Button twoBtn;
    Button threeBtn;
    Button fourBtn;
    Button fiveBtn;
    Button sixBtn;
    Button sevenBtn;
    Button eightBtn;
    Button nineBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        textCalculate = findViewById(R.id.textCalculate);
        zeroBtn = findViewById(R.id.zeroBtn);
        pointBtn = findViewById(R.id.pointBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        pressButton();
    }

    private void pressButton(){
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.zeroBtn:
                        textCalculate.setText(textCalculate.getText()+"0");
                        break;
                    case R.id.pointBtn:
                        textCalculate.setText(textCalculate.getText()+".");
                        break;
                    case R.id.oneBtn:
                        textCalculate.setText(textCalculate.getText()+"1");
                        break;
                    case R.id.twoBtn:
                        textCalculate.setText(textCalculate.getText()+"2");
                        break;
                    case R.id.threeBtn:
                        textCalculate.setText(textCalculate.getText()+"3");
                        break;
                    case R.id.fourBtn:
                        textCalculate.setText(textCalculate.getText()+"4");
                        break;
                    case R.id.fiveBtn:
                        textCalculate.setText(textCalculate.getText()+"5");
                        break;
                    case R.id.sixBtn:
                        textCalculate.setText(textCalculate.getText()+"6");
                        break;
                    case R.id.sevenBtn:
                        textCalculate.setText(textCalculate.getText()+"7");
                        break;
                    case R.id.eightBtn:
                        textCalculate.setText(textCalculate.getText()+"8");
                        break;
                    case R.id.nineBtn:
                        textCalculate.setText(textCalculate.getText()+"9");
                        break;
                }
            }
        };
        zeroBtn.setOnClickListener(onClickListener);
        pointBtn.setOnClickListener(onClickListener);
        oneBtn.setOnClickListener(onClickListener);
        twoBtn.setOnClickListener(onClickListener);
        threeBtn.setOnClickListener(onClickListener);
        fourBtn.setOnClickListener(onClickListener);
        fiveBtn.setOnClickListener(onClickListener);
        sixBtn.setOnClickListener(onClickListener);
        sevenBtn.setOnClickListener(onClickListener);
        eightBtn.setOnClickListener(onClickListener);
        nineBtn.setOnClickListener(onClickListener);

    }
}