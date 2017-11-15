package qianqi.com.qianqi.rxjava;

import qianqi.com.qianqi.mode.Zhiwei_itemInfo;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/11/12.
 */

public interface LoginModel {
    @GET("user/login")
    Observable<Zhiwei_itemInfo> login(@Query("username")String name,
                                      @Query("password") String password , OnLoginFinishedListener listener);
}
