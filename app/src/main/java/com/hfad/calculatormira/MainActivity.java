package com.hfad.calculatormira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView tempView;
    TextView textView;
    boolean isDiv;
    boolean isMult;
    boolean isPlus;
    boolean isMin;
    boolean isRes;

    private char CURRENT_ACTION;

    private double valueOne;
    private double res;
    private String temp;

    private DecimalFormat decimalFormat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decimalFormat = new DecimalFormat("#.##########");
        tempView = findViewById(R.id.temp_view);
        textView = findViewById(R.id.infoTextView);
        isDiv = false;
        isMin = false;
        isPlus = false;
        isMult = false;
        isRes = false;
    }


    public void onSevenClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "7");
        tempView.setText(tempView.getText() + "7");
        valueOne = Double.valueOf(textView.getText().toString());

    }

    public void onEightClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "8");
        tempView.setText(tempView.getText() + "8");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onNineClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "9");
        tempView.setText(tempView.getText() + "9");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onFourClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "4");
        tempView.setText(tempView.getText() + "4");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onFiveClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "5");
        tempView.setText(tempView.getText() + "5");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onSixClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "6");
        tempView.setText(tempView.getText() + "6");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onOneClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "1");
        tempView.setText(tempView.getText() + "1");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onTwoClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "2");
        tempView.setText(tempView.getText() + "2");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onThreeClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "3");
        tempView.setText(tempView.getText() + "3");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onPointClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + ".");
        tempView.setText(tempView.getText() + ".");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onZeroClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        textView.setText(textView.getText() + "0");
        tempView.setText(tempView.getText() + "0");
        valueOne = Double.valueOf(textView.getText().toString());
    }

    public void onEqualsClick(View view) {
        if (isDiv){
            res = res / valueOne;
            isDiv = false;
        }
        if (isMin){
            res = res - valueOne;
            isMin = false;
        }
        if (isPlus){
            res = res + valueOne;
            isPlus = false;
        }
        if (isMult){
            res = res * valueOne;
            isMult = false;
        }
        textView.setText(String.valueOf(res));
        tempView.setText(tempView.getText() + " = " + String.valueOf(res));
        res = 0.0;
        valueOne = 0.0;
        isRes = true;
    }

    public void onDivisionClick(View view) {
        isDiv = true;
        res = res + Double.valueOf(textView.getText().toString());
        tempView.setText(tempView.getText() + " / ");
        textView.setText("");
        valueOne = 0.0;
    }

    public void onMultiplyClick(View view) {
        isMult = true;
        res = res + Double.valueOf(textView.getText().toString());
        tempView.setText(tempView.getText() + " x ");
        textView.setText("");
        valueOne = 0.0;
    }

    public void onMinusClick(View view) {
        isMin = true;
        res = res + Double.valueOf(textView.getText().toString());
        tempView.setText(tempView.getText() + " - ");
        textView.setText("");
        valueOne = 0.0;
    }

    public void onPlusClick(View view) {
        isPlus = true;
        res = res + Double.valueOf(textView.getText().toString());
        tempView.setText(tempView.getText() + " + ");
        textView.setText("");
        valueOne = 0.0;
    }

    public void onDelClick(View view) {
        if (isRes){
            textView.setText("");
            tempView.setText("");
            isRes = false;
        }
        if (textView.getText().toString() == null || textView.getText().toString().length() == 0) {
            textView.setText("");
        }else{
            textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() -1));
        }
    }

}
