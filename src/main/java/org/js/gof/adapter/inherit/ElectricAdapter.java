package org.js.gof.adapter.inherit;

/**
 * Created by JiaShun on 2018/9/6.
 */

public class ElectricAdapter extends ElectricAppliance implements Computer {

    @Override
    public void playGame() {
        turnOn();
    }

}
