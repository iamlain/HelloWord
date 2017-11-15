package qianqi.com.qianqi.rxjava;

/**
 * Created by Administrator on 2017/11/12.
 */

interface OnLoginFinishedListener<T extends Beanbase> {

    void onUsernameError();

    void onPasswordError();

    void onSuccess( T   t );
}
