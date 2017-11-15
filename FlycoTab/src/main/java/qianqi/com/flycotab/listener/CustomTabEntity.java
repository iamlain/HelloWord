package qianqi.com.flycotab.listener;

import android.support.annotation.DrawableRes;

/**
 * Created by Administrator on 2017/11/10.
 */

public interface CustomTabEntity {
    String getTabTitle();

    @DrawableRes
    int getTabSelectedIcon();

    @DrawableRes
    int getTabUsectedIcon();


}
