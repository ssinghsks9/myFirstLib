package com.my.mylib;

import android.util.Log;

import rx.Observable;
import rx.Observer;

public class MyLibSample {

    public void callMethod(){
        System.out.println("MyLibSample :  callMethod called.... ");

        Observable<Integer> observable = Observable.just(1, 2, 3);
        observable.subscribe(new Observer<Integer>() {
            @Override public void onCompleted() {
                Log.d("Test", "In onCompleted()");
            }

            @Override public void onError(Throwable e) {
                Log.d("Test", "In onError()");
            }

            @Override public void onNext(Integer integer) {
                Log.d("Test", "In onNext():" + integer);
            }
        });
    }
}
