package org.js.gof.singleton;

/**
 * 静态内部类
 * Created by JiaShun on 2018/9/11.
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
