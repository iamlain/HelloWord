package qianqi.com.qianqi.rxjava;

/**
 * Created by Administrator on 2017/11/12.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
