package qianqi.com.flycotab.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.Unbinder;
import qianqi.com.flycotab.event.BusFactory;
import qianqi.com.flycotab.kit.KnifeKit;

/**
 * Created by Administrator on 2017/11/7.
 */

public abstract class XlActivity extends AppCompatActivity implements UiCallback{
    protected Activity context;
    private Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context=this;
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
            unbinder= KnifeKit.bind(this);
        }
        setListener();
        initData(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (useEventBus()) {
            BusFactory.getBus().register(this);
        }
    }


    @Override
    public void setListener() {

    }


    @Override
    public boolean useEventBus() {
        return false;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusFactory.getBus().unregister(this);
    }
}
