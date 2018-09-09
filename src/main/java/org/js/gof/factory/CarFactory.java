package org.js.gof.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiaShun on 2018/9/9.
 */

public class CarFactory extends Factory {
    private List cars = new ArrayList();

    @Override
    public Product createProduct(String name) {
        return new Car(name);
    }

    @Override
    public void registerProduct(Product product) {
        cars.add(((Car)product).getName());
    }

    public List getCars(){
        return cars;
    }
}
