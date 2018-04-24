package com.tentcoo.onlychart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tentcoo.onlychart.chart.activity.ChatActivity;

public class GoChart extends AppCompatActivity implements View.OnClickListener {


    private Button mGochart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gochart);
        initView();
    }

    private void initView() {
        mGochart = (Button) findViewById(R.id.gochart);
        mGochart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.gochart:
                Intent intent=new Intent(GoChart.this, ChatActivity.class);
                intent.putExtra("targetId","love");
                intent.putExtra("targetAppKey","3685d1e49bf0695493fd4383");
                intent.putExtra("conv_title","gg");
                startActivity(intent);
                break;
        }
    }
}
