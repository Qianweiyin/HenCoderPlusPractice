package com.qwy.a36_arch.mvp02;

import com.qwy.a36_arch.data.DataCenter;

public class Presenter {

    IView iView;


    Presenter(IView iView) {
        this.iView = iView;
    }

    void load() {
        //取数据，更新
        String[] data = DataCenter.getData();
        iView.showData(data[0], data[1]);
    }
}
