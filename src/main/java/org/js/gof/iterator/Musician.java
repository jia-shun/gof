package org.js.gof.iterator;
/**
 * @author JiaShun
 * @date 2018/9/3 22:08
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
