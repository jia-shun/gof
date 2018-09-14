package org.js.gof.prototype;

/**
 * @Author: JiaShun
 * @Date: 2018/9/12 22:11
 */
public interface MilkTea extends Cloneable{
    void make(String batching);
    MilkTea createClone();
}
