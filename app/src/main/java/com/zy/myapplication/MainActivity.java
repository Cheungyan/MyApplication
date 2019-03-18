package com.zy.myapplication;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zy.myapplication.fragment.ButlerFragment;
import com.zy.myapplication.fragment.GirlFragment;
import com.zy.myapplication.fragment.UserFragment;
import com.zy.myapplication.fragment.WechatFragment;
import com.zy.myapplication.ui.SettingActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Tablayouy
    private TabLayout mTablayout;
    // viewPager
    private ViewPager mViewPager;
    private List<String> mTitle;
    //Fragment
    private List<Fragment>mFragment;

    //悬浮窗
    private FloatingActionButton fab_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDate();
        initView();
    }
    //初始化 数据
    private void initDate() {
        mTitle=new ArrayList<>();
        mTitle.add(this.getString(R.string.first));
        mTitle.add(this.getString(R.string.second));
        mTitle.add(this.getString(R.string.third));
        mTitle.add(this.getString(R.string.fourth));

        mFragment=new ArrayList<>();
        mFragment.add(new ButlerFragment());
        mFragment.add(new GirlFragment());
        mFragment.add(new UserFragment());
        mFragment.add(new WechatFragment());
    }
    //初始化
    private void initView(){
        fab_setting= (FloatingActionButton) findViewById(R.id.fab_setting);
        fab_setting.setOnClickListener(this);
        mTablayout=(TabLayout) findViewById(R.id.mTabLayout);
        mViewPager=(ViewPager)findViewById(R.id.mViewPaper);
        //预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());
        
        //mViewPager滑动监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        //设置适配器

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            //选中的item
            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }
            //返回item的个数
            @Override
            public int getCount() {
                return mFragment.size();
            }

            //设置标题
            @Override
            public CharSequence getPageTitle(int position)
            {
                return mTitle.get(position);
            }
        });

        mTablayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.fab_setting:
                startActivity(new Intent(this, SettingActivity.class));
        }
    }
}
