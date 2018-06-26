package com.xy.xiaoyuanmocktoolbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.mock_sms).setOnClickListener(this);
        findViewById(R.id.mock_call).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mock_call:
//                startActivity(new Intent(this, MockSmsActivity.class));
                Toast.makeText(this, "comming soon!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mock_sms:
                startActivity(new Intent(this, MockSmsActivity.class));
                break;
        }
    }
}
