package qianqi.com.qianqi.rxjava;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/13.
 */

public class Beanbase<T> {
   private ArrayList<Box<T>> arrayList;
    private T t;
    private String aa;


    class  Box<T>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
