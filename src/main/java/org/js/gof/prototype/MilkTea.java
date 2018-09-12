package org.js.gof.prototype;

/**
 * Created by JiaShun on 2018/9/12.
 */
public interface MilkTea extends Cloneable{
    void make(String batching);
    MilkTea createClone();
}
