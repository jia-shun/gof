package org.js.gof.singleton;

/**
 * 饿汉式
 * Created by JiaShun on 2018/9/11.
 */
public class StarveSingleton {
    private StarveSingleton(){}
    private static final StarveSingleton INSTANCE = new StarveSingleton();
    public static StarveSingleton getInstance(){
        return INSTANCE;
    }
}
