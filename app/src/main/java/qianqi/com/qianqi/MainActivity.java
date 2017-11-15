package qianqi.com.qianqi;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import cn.droidlover.xdroidbase.base.XFragmentAdapter;
import qianqi.com.flycotab.base.XlActivity;

public class MainActivity extends XlActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.bottomBar)
    CommonTabLayout bottomBar;
    List<Fragment> fragmentList = new ArrayList<>();
    private String[] mTitles = {"职位", "公司", "消息", "我的"};
    private int[] mIconUnselectIds = {
            R.mipmap.ic_main_tab_contacts_nor, R.mipmap.ic_main_tab_company_nor,
            R.mipmap.ic_main_tab_find_nor, R.mipmap.ic_main_tab_my_nor};
    private int[] mIconSelectIds = {
            R.mipmap.ic_main_tab_contacts_pre, R.mipmap.ic_main_tab_company_pre,
            R.mipmap.ic_main_tab_find_pre, R.mipmap.ic_main_tab_my_pre};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    XFragmentAdapter adapter;
    final ViewPager viewpager1= (ViewPager) findViewById(R.id.viewpager);
    @Override
    public void initData(Bundle savedInstanceState) {
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        bottomBar.setTabData(mTabEntities);
        bottomBar.showDot(2);//设置红点
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int i) {
                viewpager.setCurrentItem(i);
            }

            @Override
            public void onTabReselect(int i) {

            }
        });

        initFragment();

    }

    @Override
    public void setListener() {
        super.setListener();
        ActivityManager activityManager= (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());

        WindowManager windowManager=getWindowManager();
//        ContentProvider contentProvider= (ContentProvider) getSystemService(Context.CONNECTIVITY_SERVICE);
        View System;
        NotificationManager notificationManager;
        PackageManager packageManager;
        TelephonyManager telephonyManager;
        Resources resources;
        LocationManager locationManager;
//        XMPP Service;

    }

    private void initFragment() {
        fragmentList.clear();
        fragmentList.add(JobFragment.newInstance());
        fragmentList.add(JobFragment.newInstance());
        fragmentList.add(JobFragment.newInstance());
        fragmentList.add(JobFragment.newInstance());
        if (adapter == null) {
            adapter = new XFragmentAdapter(getSupportFragmentManager(), fragmentList, mTitles);
        }
        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(3);
        viewpager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
