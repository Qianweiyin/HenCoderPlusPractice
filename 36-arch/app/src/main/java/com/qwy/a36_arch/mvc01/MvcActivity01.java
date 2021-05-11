package com.qwy.a36_arch.mvc01;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.qwy.a36_arch.R;
import com.qwy.a36_arch.data.DataCenter;



public class MvcActivity01 extends AppCompatActivity {
    EditText data0View;
    EditText data1View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mvc01);

        data0View = findViewById(R.id.data0View);
        data1View = findViewById(R.id.data1View);

        String[] data = DataCenter.getData();

        /**
         *
         * 缺陷
         * Controller和View
         * 我的控制器和我的显示部分结合的太紧密了，
         * 这个Activity中会一行一行的操作你的View，
         *
         * 对View的干涉太多了
         *
         * 当你的逻辑比较复杂时
         *
         *
         */
        data0View.setText(data[0]);
        data1View.setText(data[1]);
    }

}