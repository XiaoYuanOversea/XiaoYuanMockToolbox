package com.xy.xiaoyuanmocktoolbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MockSmsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_sms);
        initView();
    }

    private void initView() {

    }

    @Override
    public void onClick(View v) {

    }
}
