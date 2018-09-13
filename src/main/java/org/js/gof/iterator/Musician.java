package org.js.gof.iterator;
/**
 * @Author: JiaShun
 * @Date: 2018/9/3 22:01
 */
public class Musician {
    private String name;

    Musician(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
