package org.js.gof.singleton;

/**
 * 懒汉式
 * @Author: JiaShun
 * @Date: 2018/9/11 22:01
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
