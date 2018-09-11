package org.js.gof.singleton;

/**
 * 懒汉式
 * Created by JiaShun on 2018/9/11.
 */
public class LazySingleton {
    private LazySingleton(){}
    private static LazySingleton instance;
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
