package org.js.gof.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiaShun
 * @date 2018/9/9 22:01
 */
public class CarFactory extends AbstractFactory {
    private List cars = new ArrayList();

    @Override
    public AbstractProduct createProduct(String name) {
        return new Car(name);
    }

    @Override
    public void registerProduct(AbstractProduct product) {
        cars.add(((Car)product).getName());
    }

    public List getCars(){
        return cars;
    }
}
