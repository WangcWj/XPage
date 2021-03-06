package com.xuexiang.xpagedemo.fragment;

import android.view.KeyEvent;
import android.view.View;

import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xpage.base.PageContainerListFragment;
import com.xuexiang.xpage.utils.TitleBar;
import com.xuexiang.xpagedemo.MyApplication;

/**
 * @author xuexiang
 * @date 2018/1/7 下午6:47
 */
@Page(name = "XPage")
public class MainFragment extends PageContainerListFragment {

    /**
     * 获取页面的类集合[使用@Page注解进行注册的页面]
     *
     * @return
     */
    @Override
    protected Class[] getPagesClasses() {
        return new Class[]{
                DataTransmitFragment.class,
                AnimationFragment.class
        };
    }

    @Override
    protected TitleBar initTitleBar() {
        return super.initTitleBar().setLeftClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyApplication.exitBy2Click();
            }
        });
    }

    /**
     * 菜单、返回键响应
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            MyApplication.exitBy2Click();
        }
        return true;
    }



}
