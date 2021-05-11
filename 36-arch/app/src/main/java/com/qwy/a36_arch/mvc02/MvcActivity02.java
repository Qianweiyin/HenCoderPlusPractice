package com.qwy.a36_arch.mvc02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.qwy.a36_arch.R;
import com.qwy.a36_arch.data.DataCenter;

/**
 * 改进版的MVC
 */
public class MvcActivity02 extends AppCompatActivity {
    DataView dataView;


    /**
     * 这里只剩Controller了
     * setContentView(R.layout.activity_main_mvc02);
     * 这一行不能叫做我是含有View的，
     * 它就像  String[] data = DataCenter.getData()这行一样，
     * 我只是做了一个指挥，你过来吧，
     * 喂，你过来显示吧
     * <p>
     * String[] data = DataCenter.getData()这行也是，
     * 喂，你把数据给我吧
     * <p>
     * 这个是指挥，是调度
     * <p>
     * dataView.showData(data[0], data[1]);
     * 这个也是调度，
     * 喂，去吧，去显示吧，怎么显示的，我不管
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main_mvc02);

        dataView = findViewById(R.id.dataView);

        String[] data = DataCenter.getData();
        dataView.showData(data[0], data[1]);
    }


}