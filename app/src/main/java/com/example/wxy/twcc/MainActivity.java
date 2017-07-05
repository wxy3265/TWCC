package com.example.wxy.twcc;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    String str_input1 = "";
    String str_input2 = "";
    String str_output = "";
    double num_input1 = 0;
    double num_input2 = 0;
    double num_output = 0;
    boolean input1 = true;
    char fh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button__0 = (Button)findViewById(R.id.button_0);
        Button button__1 = (Button)findViewById(R.id.button_1);
        Button button__2 = (Button)findViewById(R.id.button_2);
        Button button__3 = (Button)findViewById(R.id.button_3);
        Button button__4 = (Button)findViewById(R.id.button_4);
        Button button__5 = (Button)findViewById(R.id.button_5);
        Button button__6 = (Button)findViewById(R.id.button_6);
        Button button__7 = (Button)findViewById(R.id.button_7);
        Button button__8 = (Button)findViewById(R.id.button_8);
        Button button__9 = (Button)findViewById(R.id.button_9);
        Button button__point = (Button)findViewById(R.id.button_point);
        Button button__jia = (Button)findViewById(R.id.button_jia);
        Button button__jian = (Button)findViewById(R.id.button_jian);
        Button button__cheng = (Button)findViewById(R.id.button_cheng);
        Button button__chu = (Button)findViewById(R.id.button_chu);
        Button button__dy = (Button)findViewById(R.id.button_dy);
        Button button__clean = (Button)findViewById(R.id.button_clean);
        Button button__delet = (Button)findViewById(R.id.button_delet);

        button__0.setOnClickListener(this);
        button__1.setOnClickListener(this);
        button__2.setOnClickListener(this);
        button__3.setOnClickListener(this);
        button__4.setOnClickListener(this);
        button__5.setOnClickListener(this);
        button__6.setOnClickListener(this);
        button__7.setOnClickListener(this);
        button__8.setOnClickListener(this);
        button__9.setOnClickListener(this);
        button__point.setOnClickListener(this);
        button__jia.setOnClickListener(this);
        button__jian.setOnClickListener(this);
        button__cheng.setOnClickListener(this);
        button__chu.setOnClickListener(this);
        button__dy.setOnClickListener(this);
        button__clean.setOnClickListener(this);
        button__delet.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView textView_output = (TextView)findViewById(R.id.tv_output);
        TextView textView_output1 = (TextView)findViewById(R.id.tv_output1);
        switch (v.getId()) {
            case R.id.button_0:
                if (input1) {
                    str_input1 += "0";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "0";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_1:
                if (input1) {
                    str_input1 += "1";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "1";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_2:
                if (input1) {
                    str_input1 += "2";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "2";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_3:
                if (input1) {
                    str_input1 += "3";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "3";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_4:
                if (input1) {
                    str_input1 += "4";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "4";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_5:
                if (input1) {
                    str_input1 += "5";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "5";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_6:
                if (input1) {
                    str_input1 += "6";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "6";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_7:
                if (input1) {
                    str_input1 += "7";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "7";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_8:
                if (input1) {
                    str_input1 += "8";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "8";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_9:
                if (input1) {
                    str_input1 += "9";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += "9";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_point:
                if (input1) {
                    str_input1 += ".";
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 += ".";
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_delet:
                if (input1) {
                    str_input1 = str_input1.substring(0, str_input1.length()-1);
                    textView_output.setText(str_input1);
                }
                else {
                    str_input2 = str_input2.substring(0, str_input2.length()-1);
                    textView_output.setText(str_input2);
                }
                break;
            case R.id.button_clean:
                str_input1 = "";
                str_input2 = "";
                str_output = "";
                num_input1 = 0;
                num_input2 = 0;
                num_output = 0;
                fh = '\0';
                textView_output.setText("");
                textView_output1.setText("");
                break;
            case R.id.button_jia:
                if (input1) {
                    input1 = false;
                    fh = '+';
                    textView_output1.setText("+");
                }
                else {
                    if (str_input2 == "") {
                        fh = '+';
                        textView_output1.setText("+");
                    }
                    else {
                        num_input1 = Double.parseDouble(str_input1);
                        num_input2 = Double.parseDouble(str_input2);
                        if (fh == '+')
                            num_output = num_input1 + num_input2;
                        else if (fh == '-')
                            num_output = num_input1 - num_input2;
                        else if (fh == '*')
                            num_output = num_input1 * num_input2;
                        else if (fh == '/')
                            num_output = num_input1 / num_input2;
                        str_output = Double.toString(num_output);
                        int a = (int) num_output;
                        if (a == num_output) {
                            str_output = str_output.substring(0, str_output.length() - 1);
                            str_output = str_output.substring(0, str_output.length() - 1);
                        }
                        textView_output.setText(str_output);
                        num_input1 = num_output;
                        num_output = 0;
                        num_input2 = 0;
                        str_input2 = "";
                        fh = '+';
                        textView_output1.setText("+");
                    }
                }
                break;
            case R.id.button_cheng:
                if (input1) {
                    input1 = false;
                    fh = '*';
                    textView_output1.setText("×");
                }
                else {
                    if (str_input2 == "") {
                        fh = '*';
                        textView_output1.setText("×");
                    }
                    else {
                        num_input1 = Double.parseDouble(str_input1);
                        num_input2 = Double.parseDouble(str_input2);
                        if (fh == '+')
                            num_output = num_input1 + num_input2;
                        else if (fh == '-')
                            num_output = num_input1 - num_input2;
                        else if (fh == '*')
                            num_output = num_input1 * num_input2;
                        else if (fh == '/')
                            num_output = num_input1 / num_input2;
                        str_output = Double.toString(num_output);
                        int a = (int) num_output;
                        if (a == num_output) {
                            str_output = str_output.substring(0, str_output.length() - 1);
                            str_output = str_output.substring(0, str_output.length() - 1);
                        }
                        textView_output.setText(str_output);
                        num_input1 = num_output;
                        num_output = 0;
                        num_input2 = 0;
                        str_input2 = "";
                        fh = '*';
                        textView_output1.setText("×");
                    }
                }
                break;
            case R.id.button_chu:
                if (input1) {
                    input1 = false;
                    fh = '/';
                    textView_output1.setText("÷");
                }
                else {
                    if (str_input2 == "") {
                        fh = '/';
                        textView_output1.setText("÷");
                    }
                    else {
                        num_input1 = Double.parseDouble(str_input1);
                        num_input2 = Double.parseDouble(str_input2);
                        if (fh == '+')
                            num_output = num_input1 + num_input2;
                        else if (fh == '-')
                            num_output = num_input1 - num_input2;
                        else if (fh == '*')
                            num_output = num_input1 * num_input2;
                        else if (fh == '/')
                            num_output = num_input1 / num_input2;
                        str_output = Double.toString(num_output);
                        int a = (int) num_output;
                        if (a == num_output) {
                            str_output = str_output.substring(0, str_output.length() - 1);
                            str_output = str_output.substring(0, str_output.length() - 1);
                        }
                        textView_output.setText(str_output);
                        num_input1 = num_output;
                        num_output = 0;
                        num_input2 = 0;
                        str_input2 = "";
                        fh = '/';
                        textView_output1.setText("÷");
                    }
                }
                break;
            case R.id.button_jian:
                if (input1) {
                    input1 = false;
                    fh = '-';
                    textView_output1.setText("-");
                }
                else {
                    if (str_input2 == "") {
                        fh = '-';
                        textView_output1.setText("-");
                    }
                    else {
                        num_input1 = Double.parseDouble(str_input1);
                        num_input2 = Double.parseDouble(str_input2);
                        if (fh == '+')
                            num_output = num_input1 + num_input2;
                        else if (fh == '-')
                            num_output = num_input1 - num_input2;
                        else if (fh == '*')
                            num_output = num_input1 * num_input2;
                        else if (fh == '/')
                            num_output = num_input1 / num_input2;
                        str_output = Double.toString(num_output);
                        int a = (int) num_output;
                        if (a == num_output) {
                            str_output = str_output.substring(0, str_output.length() - 1);
                            str_output = str_output.substring(0, str_output.length() - 1);
                        }
                        textView_output.setText(str_output);
                        num_input1 = num_output;
                        num_output = 0;
                        num_input2 = 0;
                        str_input2 = "";
                        fh = '-';
                        textView_output1.setText("-");
                    }
                }
                break;
            case R.id.button_dy:
                num_input1 = Double.parseDouble(str_input1);
                num_input2 = Double.parseDouble(str_input2);
                if (fh == '+')
                    num_output = num_input1 + num_input2;
                else if (fh == '-')
                    num_output = num_input1 - num_input2;
                else if (fh == '*')
                    num_output = num_input1 * num_input2;
                else if (fh == '/')
                    num_output = num_input1 / num_input2;
                str_output = Double.toString(num_output);
                int a = (int)num_output;
                if (a == num_output){
                    str_output = str_output.substring(0, str_output.length()-1);
                    str_output = str_output.substring(0, str_output.length()-1);
                }
                textView_output.setText(str_output);
                input1 = true;
                num_input1 = 0;
                num_input2 = 0;
                num_output = 0;
                str_input1 = "";
                str_input2 = "";
                str_output = "";
                textView_output1.setText("");
                break;
            default:
                break;
        }
    }

}
