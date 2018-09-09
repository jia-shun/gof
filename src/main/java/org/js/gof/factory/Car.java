package org.js.gof.factory;

/**
 * Created by JiaShun on 2018/9/9.
 */

public class Car extends Product {
    private String name;
    Car(String name){
        this.name = name;
    }
    @Override
    public void use() {
        System.out.println("今天开" + this.name + "遛弯。。");
    }
    public String getName(){
        return this.name;
    }
}
