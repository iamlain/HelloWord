package qianqi.com.qianqi.rxjava;

import qianqi.com.qianqi.mode.Zhiwei_itemInfo;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;


/**
 * Created by Administrator on 2017/11/12.
 */

public class MyServiceImpl {
    void do_login(final OnLoginFinishedListener loginPresenter){
        loginPresenter.onPasswordError();

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("")
                .build();

        final MyService myService = retrofit.create(MyService.class);
        Subscription subscribe = myService.login("", "", new LoginPresenterImpl(new LoginView() {
            @Override
            public void showProgress() {

            }

            @Override
            public void hideProgress() {

            }

            @Override
            public void setUsernameError() {

            }

            @Override
            public void setPasswordError() {

            }

            @Override
            public void navigateToHome() {

            }
        }))
                .flatMap(new Func1<Zhiwei_itemInfo, Observable<Zhiwei_itemInfo>>() {
                    @Override
                    public Observable<Zhiwei_itemInfo> call(Zhiwei_itemInfo zhiwei_itemInfo) {
                        Observable<Zhiwei_itemInfo> zhiwei_itemInfoObservable = myService.login("", "").observeOn(Schedulers.io());

                        return zhiwei_itemInfoObservable;
                    }


                })
                .subscribeOn(Schedulers.newThread())
                .observeOn(Schedulers.io())
                .doOnNext(new Action1<Zhiwei_itemInfo>() {
                    @Override
                    public void call(Zhiwei_itemInfo zhiwei_itemInfo) {

                    }
                }).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Zhiwei_itemInfo>() {
                    @Override
                    public void onCompleted() {
//                        loginPresenter.onSuccess();

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Zhiwei_itemInfo zhiwei_itemInfo) {

                    }
                });
    }


}
