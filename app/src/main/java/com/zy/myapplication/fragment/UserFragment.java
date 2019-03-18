package com.zy.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zy.myapplication.R;
/**
 * 项目名：MyApplication
 * 包名：com.zy.myapplication.fragment
 * Created by Administrator on 2019/2/28.
 */

public class UserFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user,null);
        return view;
    }
}
