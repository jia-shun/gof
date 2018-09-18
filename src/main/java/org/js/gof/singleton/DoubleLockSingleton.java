package org.js.gof.singleton;

/**
 * 双检锁
 * @author JiaShun
 * @date 2018/9/11 23:01
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
