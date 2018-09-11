package org.js.gof.singleton;

/**
 * 双检锁
 * Created by JiaShun on 2018/9/11.
 */
public class DoubleLockSingleton {
    private DoubleLockSingleton(){}
    private static volatile DoubleLockSingleton instance;
    public static DoubleLockSingleton getInstance(){
        if(null == instance){
            synchronized (DoubleLockSingleton.class){
                if(null == instance){
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
