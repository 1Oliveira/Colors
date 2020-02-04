package com.pjct.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRandom;
    View viewColors;
    SeekBar sbRed, sbGreen, sbBlue;
    TextView tvRed, tvGreen, tvBlue;
    int vermelho, verde, azul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
        botaoRandomCor();

        sbRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresso, boolean b) {
                vermelho = progresso;
                int cores = Color.rgb(vermelho,verde,azul);
                viewColors.setBackgroundColor(cores);
                valorCores();


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });
        sbGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresso, boolean b) {
                verde = progresso;
                int cores = Color.rgb(vermelho, verde, azul);
                viewColors.setBackgroundColor(cores);
                valorCores();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sbBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progresso, boolean b) {
                azul = progresso;
                int cores = Color.rgb(vermelho, verde, azul);
                viewColors.setBackgroundColor(cores);
                valorCores();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botaoRandomCor();
                valorCores();
            }
        });
    }
    void iniciarComponentes(){
        viewColors=findViewById(R.id.viewColors);
        sbBlue=findViewById(R.id.sbBlue);
        sbGreen=findViewById(R.id.sbGreen);
        sbRed=findViewById(R.id.sbRed);
        tvRed=findViewById(R.id.tvRed);
        tvBlue=findViewById(R.id.tvBlue);
        tvGreen=findViewById(R.id.tvGreen);
        btnRandom=findViewById(R.id.btnRandom);

    }
    void valorCores(){
        tvRed.setText("Valor do Vermelho: " + vermelho);
        tvGreen.setText("Valor do Verde: " + verde);
        tvBlue.setText("Valor do Azul: " + azul);

    }
    void botaoRandomCor(){
     corAleatoria();
     int cores = Color.rgb(vermelho,verde,azul);
     viewColors.setBackgroundColor(cores);
     sbRed.setProgress(vermelho);
     sbGreen.setProgress(verde);
     sbBlue.setProgress(azul);

    }
    void corAleatoria(){
        Random random = new Random();
        vermelho=random.nextInt(255);
        verde=random.nextInt(255);
        azul=random.nextInt(255);
    }
}
