package org.js.gof.factoryMethod;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * 我们的产品从工厂中创建，不用new同样可以use();
 * @Author: JiaShun
 * @Date: 2018/9/9 22:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {
    @Test
    public void testFactory(){
        AbstractFactory factory = new CarFactory();
        AbstractProduct bmw = factory.create("bmw");
        AbstractProduct benz = factory.create("benz");
        AbstractProduct honda = factory.create("honda");
        bmw.use();
        benz.use();
        honda.use();
        List cars = ((CarFactory) factory).getCars();
        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

    }
}
