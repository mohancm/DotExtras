package com.dotos.dotextras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        getFragmentManager().beginTransaction()
                .replace(R.id.container, new dotExtrasMain())
                .commitAllowingStateLoss();
    }
}
