package com.qwy.a42_generics;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Object> list = new ArrayList<String>();


        Wrapper<String> stringWrapper = new Wrapper<>();
        stringWrapper.setInstance("");
        String s = stringWrapper.getInstance();


        HenCoderList<String> list1 = new HenCoderList<>();
        list1.add("qianweiyin");
        String name = list1.getInstance(0);


        NoGenericList list2 = new NoGenericList();
        if ("qianweiyin" instanceof String) {
            list2.add("qianweiyin");
        }

        if (Integer.class.isInstance(1)) {
            list2.add(1);
        }




    }
}