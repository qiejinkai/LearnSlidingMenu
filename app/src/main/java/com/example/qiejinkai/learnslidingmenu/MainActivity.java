package com.example.qiejinkai.learnslidingmenu;

import android.app.Activity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = new SlidingMenu(this);
        sm.setMode(SlidingMenu.LEFT);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        sm.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        sm.setMenu(R.layout.sliding_menu);

    }

    private SlidingMenu sm ;
}
