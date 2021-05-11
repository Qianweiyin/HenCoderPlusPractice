package com.qwy.a36_arch.mvp02;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.qwy.a36_arch.R;

public class MvpActivity02 extends AppCompatActivity implements IView {

    EditText data0View;
    EditText data1View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mvc01);

        data0View = findViewById(R.id.data0View);
        data1View = findViewById(R.id.data1View);


        new Presenter(this).load();


    }


    @Override
    public void showData(String data1, String data2) {
        data0View.setText(data1);
        data1View.setText(data2);
    }
}