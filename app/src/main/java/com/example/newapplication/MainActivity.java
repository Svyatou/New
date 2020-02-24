package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int value = 0;
    Button btnAdd;
    Button btnTake;
    Button btnGrow;
    Button btnReset;
    Button btnShring;
    Button btnHide;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnTake = (Button)findViewById(R.id.btnTake);
        btnGrow = (Button)findViewById(R.id.btnGrow);
        btnShring = (Button)findViewById(R.id.btnShring);
        btnHide = (Button)findViewById(R.id.btnHide);
        btnReset = (Button)findViewById(R.id.btnShring);
        txtView = (TextView)findViewById(R.id.txtView);

        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShring.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float size;
        v.getId();

        switch(v.getId()){
            case R.id.btnAdd:
                value++;
                txtView.setText("" +value);
                break;
            case R.id.btnTake:
                value--;
                txtView.setText("" +value);
                break;
            case R.id.btnGrow:
                size = txtView.getTextScaleX();
                txtView.setTextScaleX(size+1);
                break;
            case R.id.btnShring:
               size = txtView.getTextScaleX();
               txtView.setTextScaleX(size-1);
               break;
            case R.id.btnHide:
                if(txtView.getVisibility() == txtView.VISIBLE){
                    txtView.setText("SHOW");
                }
                else if(txtView.getVisibility() != txtView.VISIBLE){
                    txtView.setText("HIDE");
                }
                break;
        }


    }
}
