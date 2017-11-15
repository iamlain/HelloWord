package qianqi.com.qianqi;

import android.os.Bundle;

import qianqi.com.flycotab.base.XLazyFragment;

/**
 * Created by Administrator on 2017/11/7.
 */

public class BasePageFragment extends XLazyFragment{
    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_base_pager;
    }
}
