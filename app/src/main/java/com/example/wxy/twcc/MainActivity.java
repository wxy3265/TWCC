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

    /*String str_input1 = "0";//第一个数的输入字符串
    String str_input2 = "0";//第二个数的输入字符串
    String str_output = "";//得数的输出字符串*/
    boolean point = false;
    double num_input1 = 0;//第一个数的输入数字
    double num_input2 = 0;//第二个数的输入数字
    double num_output = 0;//输出数字
    boolean input1 = true;//是否正在输入第一个数字
    boolean input3 = false;//是否正在输入第三个数字
    int ws = 0;//记录输入数据的位数
    int point_ws;

    char op;//操作符号

    private double Dy(double a, double b) {
        if (op == '+') return a + b;
        else if (op == '-') return a - b;
        else if (op == '*') return a * b;
        else if (op == '/') return a / b;
        return 0;
    }

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
                    if (ws < 9) {
                        num_input1 *= 10;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    }
                } else {
                    if (ws < 9 ){
                        num_input2 *= 10;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_1:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 1;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 1;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_2:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 2;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 2;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_3:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 3;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 3;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_4:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 4;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 4;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_5:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 5;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 5;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_6:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 6;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 6;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_7:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 7;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 7;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_8:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 8;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 8;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_9:
                if (ws < 9) {
                    if (input1) {
                        num_input1 = num_input1 * 10 + 9;
                        textView_output.setText(num_input1 - (int) num_input1 != 0 ? Double.toString(num_input1) : Integer.toString((int) num_input1));
                        ws++;
                    } else {
                        num_input2 = num_input2 * 10 + 9;
                        textView_output.setText(num_input2 - (int) num_input2 != 0 ? Double.toString(num_input2) : Integer.toString((int) num_input2));
                        ws++;
                    }
                }
                break;
            case R.id.button_point:
                if (!point) {
                    point = true;
                }
                break;
            case R.id.button_jia:
                if (input1 && (!input3)) {
                    input1 = false;
                    op = '+';
                    textView_output1.setText("+");
                    ws = 0;
                } else if (!input1){
                    input1 = true;
                    input3 = true;
                    num_output = Dy(num_input1, num_input2);
                    op = '+';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("+");
                    num_input1 = 0;
                    ws = 0;
                } else if (input3) {
                    num_output = Dy(num_output, num_input1);
                    op = '+';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("+");
                    num_input1 = 0;
                    ws = 0;
                }
                break;
            case R.id.button_jian:
                if (input1 && (!input3)) {
                    input1 = false;
                    op = '-';
                    textView_output1.setText("-");
                    ws = 0;
                } else if (!input1){
                    input1 = true;
                    input3 = true;
                    num_output = Dy(num_input1, num_input2);
                    op = '-';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("-");
                    num_input1 = 0;
                    ws = 0;
                } else if (input3) {
                    num_output = Dy(num_output, num_input1);
                    op = '-';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("-");
                    num_input1 = 0;
                    ws = 0;
                }
                break;
            case R.id.button_chu:
                if (input1 && (!input3)) {
                    input1 = false;
                    op = '/';
                    textView_output1.setText("·/·");
                    ws = 0;
                } else if (!input1){
                    input1 = true;
                    input3 = true;
                    num_output = Dy(num_input1, num_input2);
                    op = '/';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("·/·");
                    num_input1 = 0;
                    ws = 0;
                } else if (input3) {
                    num_output = Dy(num_output, num_input1);
                    op = '/';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("·/·");
                    num_input1 = 0;
                    ws = 0;
                }
                break;
            case R.id.button_cheng:
                if (input1 && (!input3)) {
                    input1 = false;
                    op = '*';
                    textView_output1.setText("X️");
                    ws = 0;
                } else if (!input1){
                    input1 = true;
                    input3 = true;
                    num_output = Dy(num_input1, num_input2);
                    op = '*';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("X️");
                    num_input1 = 0;
                    ws = 0;
                } else if (input3) {
                    num_output = Dy(num_output, num_input1);
                    op = '*';
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText("X️");
                    num_input1 = 0;
                    ws = 0;
                }
                break;
            case R.id.button_dy:
                if (input1 && (!input3)) {
                    textView_output1.setText(" ");
                } else if (!input1){
                    input1 = false;
                    input3 = false;
                    num_output = Dy(num_input1, num_input2);
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText(" ️");
                    num_input1 = num_output;
                    num_input2 = 0;
                    num_output = 0;
                    ws = 0;
                } else if (input3) {
                    input1 = false;
                    input3 = false;
                    num_output = Dy(num_output, num_input1);
                    textView_output.setText(num_output - (int) num_output != 0 ? Double.toString(num_output) : Integer.toString((int)num_output));
                    textView_output1.setText(" ️");
                    num_input1 = num_output;
                    num_input2 = 0;
                    num_output = 0;
                    ws = 0;
                }
                break;
            case R.id.button_clean:
                input1 = true;
                input3 = false;
                textView_output.setText("0");
                textView_output1.setText(" ️");
                num_input1 = 0;
                num_input2 = 0;
                num_output = 0;
                ws = 0;
                break;
            default:
                break;
        }
    }

}
