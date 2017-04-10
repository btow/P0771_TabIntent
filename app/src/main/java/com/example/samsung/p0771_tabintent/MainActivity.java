package com.example.samsung.p0771_tabintent;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Получение TabHost
        TabHost tabhost = getTabHost();
        //т.к. инициализация выполнена в getTabHost, то метод setup вызывать не нужно
        TabHost.TabSpec tabSpec;

        tabSpec = tabhost.newTabSpec(getString(R.string.tag1));
        tabSpec.setIndicator(getString(R.string.title_tab_1));
        tabSpec.setContent(new Intent(this, OneActivity.class));

        tabhost.addTab(tabSpec);

        tabSpec = tabhost.newTabSpec(getString(R.string.tag2));
        tabSpec.setIndicator(getString(R.string.title_tab_2));
        tabSpec.setContent(new Intent(this, TwoActivity.class));

        tabhost.addTab(tabSpec);
    }
}
