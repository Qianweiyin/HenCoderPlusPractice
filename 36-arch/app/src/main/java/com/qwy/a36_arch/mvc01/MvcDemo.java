package com.qwy.a36_arch.mvc01;

public class MvcDemo {
    /**
     * Model把结果交给View，告诉View，去，更新吧
     */
    class Model {
        int data;
        View view;
        void dataAdd( int delta) {
            data += delta;
            view.showData(data);
        }
    }

    /**
     * View是用来显示，以及把操作传给Controller
     * 把用户的事件传给Controller
     */
    class View {
        Controller controller;
        void showData(int data) {
            //  ....
        }

        void clicked() {
            controller.viewClicked(this);
        }
    }

    /**
     * Controller负责调度，也就是操作Model，
     * 让它去执行业务逻辑，告诉Model，
     * 你要去做什么，Model具体做那个事
     */
    class Controller {
        Model model;

        void viewClicked(View view) {
//            switch (view.id) {
//                case  ??:
                    model.dataAdd(1);
//                    break;
//            }
        }
    }
}
