package org.js.gof.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JiaShun on 2018/9/12.
 */
public class Container {
    private Map<String,MilkTea> map = new  HashMap<>();
    public void register(String name, MilkTea mt){
        this.map.put(name,mt);
    }
    public MilkTea create(String name){
        MilkTea mt = map.get(name);
        return mt.createClone();
    }
}
