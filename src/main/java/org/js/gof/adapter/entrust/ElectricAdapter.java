package org.js.gof.adapter.entrust;

/**
 * @Author: JiaShun
 * @Date: 2018/9/6 22:01
 */
public class ElectricAdapter extends AbstractComputer {
    private ElectricAppliance electricAppliance;
    public ElectricAdapter(){
        this.electricAppliance = new ElectricAppliance();
    }

    @Override
    public void playGame() {
        electricAppliance.turnOn();
    }

}
