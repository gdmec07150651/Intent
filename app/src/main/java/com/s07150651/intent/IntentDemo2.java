package com.s07150651.intent;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by LH on 2016/10/25.
 */
public class IntentDemo2 extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_demo1);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void upper(View v){
        Intent intent = getIntent();
        Bundle bundle =intent.getExtras();
        final String value = bundle.getString("value").toUpperCase();
        Intent intentresult = new Intent();
        intentresult.putExtra("result",value);
        setResult(RESULT_OK,intentresult);
    }
}
