package org.js.gof.adapter.inherit;

/**
 * @author JiaShun
 * @date 2018/9/6 22:25
 */
public class ElectricAdapter extends ElectricAppliance implements Computer {

    @Override
    public void playGame() {
        turnOn();
    }

}
