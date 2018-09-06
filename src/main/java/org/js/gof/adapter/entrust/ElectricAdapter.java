package org.js.gof.adapter.entrust;

/**
 * Created by JiaShun on 2018/9/6.
 */

public class ElectricAdapter extends Computer {
    private ElectricAppliance electricAppliance;
    public ElectricAdapter(){
        this.electricAppliance = new ElectricAppliance();
    }

    @Override
    public void playGame() {
        electricAppliance.turnOn();
    }

}
