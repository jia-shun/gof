package org.js.gof.singleton;

/**
 * 饿汉式
 * @Author: JiaShun
 * @Date: 2018/9/11 22:01
 */
public class StarveSingleton {
    private StarveSingleton(){}
    private static final StarveSingleton INSTANCE = new StarveSingleton();
    public static StarveSingleton getInstance(){
        return INSTANCE;
    }
}
