package com.example.snow_.seekbarrenkolusturma;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBarRed,seekBarGreen,seekBarBlue;
    private TextView txtrgb,txthex;
    private LinearLayout linearLayout;
    private int k,y,m;

    private void init(){
        seekBarBlue=(SeekBar)findViewById(R.id.sbBlue);
        seekBarGreen=(SeekBar)findViewById(R.id.sbGreen);
        seekBarRed=(SeekBar)findViewById(R.id.sbRed);
        txtrgb=(TextView)findViewById(R.id.txtRGB);
        txthex=(TextView)findViewById(R.id.txtHEX);
        linearLayout=(LinearLayout)findViewById(R.id.linear1);
    }
    private void renkler(){
        sbRed_Changed();
        sbGreen_Changed();
        sbBlue_Changed();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        renkler();
    }
    public void sbRed_Changed(){
        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                k = seekBar.getProgress();
                Paint();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void sbGreen_Changed(){
        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                y=seekBar.getProgress();
                Paint();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void sbBlue_Changed(){
        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                m=seekBar.getProgress();
                Paint();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void Paint(){
        linearLayout.setBackgroundColor(Color.rgb(k,y,m));
        txtrgb.setText(String.format("R:%d G:%d B:%d",k,y,m));
        txthex.setText(String.format("#%X%X%X",k,y,m));
        seekBarRed.setProgress(k);
        seekBarGreen.setProgress(y);
        seekBarBlue.setProgress(m);
    }
    public void Paint(int k,int y,int m){
        linearLayout.setBackgroundColor(Color.rgb(k,y,m));
        txtrgb.setText(String.format("R:%d G:%d B:%d",k,y,m));
        txthex.setText(String.format("#%X%X%X",k,y,m));
        seekBarBlue.setProgress(m);
        seekBarRed.setProgress(k);
        seekBarGreen.setProgress(y);
    }
}
