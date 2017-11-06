package com.demo.tts.bkmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//import butterknife.BindView;
//import butterknife.OnClick;

/**
 * Created by jemy on 2017/11/2.
 */

public class BkActivity extends AppCompatActivity {
    @BindView(R2.id.tv_inject)
    TextView tvInject;
    @BindView(R2.id.tv_click)
    TextView tvClick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk);
        ButterKnife.bind(this);
        tvInject.setText("注入后");
    }

    @OnClick(R2.id.tv_click) void click() {
        tvClick.setText("点击后");
    }
}
