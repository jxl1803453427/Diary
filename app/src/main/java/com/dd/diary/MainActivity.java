package com.dd.diary;

import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.dd.diary.base.BaseActivity;
import com.dd.diary.base.BaseFragment;
import com.dd.diary.diary.ui.DiaryFragment;
import com.dd.diary.personal.ui.PersonalFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ViewPager mViewPager;
    private DiaryFragment mDiaryFragment;
    private PersonalFragment mPersonalFragment;
    private MainVpAdapter mVpAdapter;
    private RadioGroup mRadioGroup;
    private RadioButton mRbDiary;
    private RadioButton mRbPersonal;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mViewPager = (ViewPager) findViewById(R.id.vp_main);
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_main);
        mRbDiary = (RadioButton) findViewById(R.id.rb_main_home);
        mRbPersonal = (RadioButton) findViewById(R.id.rb_main_personal);

    }

    @Override
    protected void initData() {
        mDiaryFragment = new DiaryFragment();
        mPersonalFragment = new PersonalFragment();

        List<BaseFragment> fragments = new ArrayList<>();
        fragments.add(mDiaryFragment);
        fragments.add(mPersonalFragment);
        mVpAdapter = new MainVpAdapter(fragments,getSupportFragmentManager());
        mViewPager.setAdapter(mVpAdapter);
        mRbDiary.setChecked(true);

    }

    @Override
    protected void load() {

    }

    @Override
    protected void initEvent() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.rb_main_home:
                        mViewPager.setCurrentItem(0,false);
                        break;
                    case R.id.rb_main_personal:
                        mViewPager.setCurrentItem(1,false);
                        break;
                }
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        mRbDiary.setChecked(true);
                        break;
                    case 1:
                        mRbPersonal.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

}
