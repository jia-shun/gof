package org.js.gof.prototype;

/**
 * @Author: JiaShun
 * @Date: 2018/9/12 22:01
 */
public class PuddingMilkTea implements MilkTea {
    @Override
    public void make(String batching) {
        System.out.println("**************************************");
        System.out.println("*** make a cup of " + batching + " milk tea ***");
        System.out.println("**************************************");
    }

    @Override
    public MilkTea createClone() {
        MilkTea mt = null;
        try {
            mt = (MilkTea) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mt;
    }
}
