package com.dd.diary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dd.diary.base.BaseFragment;

import java.util.List;

/**
 * Created by Administrator on 2017/8/6.
 */

public class MainVpAdapter extends FragmentStatePagerAdapter{
    private List<BaseFragment> fragments;

    public MainVpAdapter(List<BaseFragment> fragments,FragmentManager fm) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        if(fragments != null){
            return fragments.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
