package org.js.gof.iterator;

/**
 * Created by JiaShun on 2018/9/3.
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
