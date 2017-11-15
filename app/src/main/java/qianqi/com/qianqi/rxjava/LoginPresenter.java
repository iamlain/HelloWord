package qianqi.com.qianqi.rxjava;

/**
 * Created by Administrator on 2017/11/12.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
