package org.js.gof.factory;

/**
 * Created by JiaShun on 2018/9/9.
 */

public abstract class Factory {
    public final Product create(String name){
        Product product = this.createProduct(name);
        registerProduct(product);
        return product;
    }
    public abstract Product createProduct(String name);
    public abstract void registerProduct(Product product);
}
