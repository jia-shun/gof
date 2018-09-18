package org.js.gof.singleton;

/**
 * 饿汉式
 * @author JiaShun
 * @date 2018/9/11 23:05
 */
public class StarveSingleton {
    private StarveSingleton(){}
    private static final StarveSingleton INSTANCE = new StarveSingleton();
    public static StarveSingleton getInstance(){
        return INSTANCE;
    }
}
