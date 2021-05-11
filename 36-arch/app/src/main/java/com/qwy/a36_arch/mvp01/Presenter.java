package com.qwy.a36_arch.mvp01;

import com.qwy.a36_arch.data.DataCenter;

public class Presenter {

    MvpActivity01 mvpActivity;


    Presenter(MvpActivity01 mvpActivity) {
        this.mvpActivity = mvpActivity;
    }

    void load() {
        //取数据，更新
        String[] data = DataCenter.getData();
        mvpActivity.showData(data[0], data[1]);
    }
}
