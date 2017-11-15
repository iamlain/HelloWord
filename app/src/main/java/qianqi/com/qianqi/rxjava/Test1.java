package qianqi.com.qianqi.rxjava;

import android.graphics.Bitmap;


import qianqi.com.qianqi.mode.Mybean;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/11/8.
 */

public class Test1 {
    public static void main(String[] args) {
        System.out.print("sss");
        do_test0();
    }

    private static void do_test1() {
        Observable.create(new Observable.OnSubscribe<Bitmap>() {
            @Override
            public void call(Subscriber<? super Bitmap> subscriber) {

            }
        }).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bitmap>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Bitmap bitmap) {

                    }
                });
    }

    private static void do_test0() {

        Mybean mybean1=new Mybean();
        mybean1.setIstrue(false);
        mybean1.setName("nihao");
        mybean1.setPass("1");

        Mybean mybean2=new Mybean();
        mybean2.setIstrue(false);
        mybean2.setName("nihao");
        mybean2.setPass("1");

        System.out.print(mybean1==mybean2);

    }


}
