package org.js.gof.singleton;

/**
 * 懒汉式
 * @author JiaShun
 * @date 2018/9/11 22:10
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
