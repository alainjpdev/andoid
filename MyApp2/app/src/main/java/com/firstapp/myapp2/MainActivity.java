package com.firstapp.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        et3 = (EditText)findViewById(R.id.txt_num3);
        tv1 = (TextView)findViewById(R.id.tv_estatus);
    }
    //Este metodo realiza el promedio.
    public void Promedio(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int num3 = Integer.parseInt(valor3);

        int promedio = (num1 + num2 + num3)/3;
        if(promedio >= 6){
            tv1.setText("Estatus Aprobado con " + promedio);
        } else if (promedio <= 5){
            tv1.setText("Estatus Reprobado con " + promedio);
        }



    }
}