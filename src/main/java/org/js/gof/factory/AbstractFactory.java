package org.js.gof.factory;

/**
 * @author JiaShun
 * @date 2018/9/9 22:01
 */
public abstract class AbstractFactory {
    public final AbstractProduct create(String name){
        AbstractProduct product = this.createProduct(name);
        registerProduct(product);
        return product;
    }
    public abstract AbstractProduct createProduct(String name);
    public abstract void registerProduct(AbstractProduct product);
}
