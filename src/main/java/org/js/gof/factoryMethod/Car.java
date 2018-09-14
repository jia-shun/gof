package org.js.gof.factoryMethod;

/**
 * @Author: JiaShun
 * @Date: 2018/9/9 22:01
 */
public class Car extends AbstractProduct {
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
