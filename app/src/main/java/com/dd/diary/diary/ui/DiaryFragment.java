package com.dd.diary.diary.ui;

import android.support.v7.widget.RecyclerView;

import com.dd.diary.R;
import com.dd.diary.base.BaseFragment;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by Administrator on 2017/8/6.
 */

public class DiaryFragment extends BaseFragment{
    private RecyclerView mRv;

    @Override
    protected void initView() {
        mRv = (RecyclerView) root.findViewById(R.id.rv_diary);
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_diary;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("diaryFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("diaryFragment");
    }
}
