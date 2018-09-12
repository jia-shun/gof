package org.js.gof.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 做一杯奶茶，如果加珍珠就是珍珠奶茶，如果加布丁🍮，就是布丁奶茶。
 *
 * 本例中，我们从容器(框架)创建出对象，而不是new出来。而进入容器的create()
 * 方法发现调用的是Object的clone()方法。
 *
 * 这样看的话Prototype模式是不是将一个简单的问题复杂化了？试想以下几个问题:
 * 1:有一个基准类奶茶，添加珍珠就是珍珠奶茶，添加布丁就是布丁奶茶，添加刘强东就是京东奶茶。。
 * 如果为每种奶茶样式都维护一个类对象，假设有上千个样式，这些类对象的维护将会变成一种灾难。。
 * 2:我们将复制(clone)实例的部分封装在容器中。在create()方法中，并没有使用类名，而是使用
 * 字符串为生成的实例命名，与new对象相比，这种方式有更好的通用性，而且将框架从类名的束缚中解脱。
 *
 * 思考几个问题:
 * 1:我们复制类实例对象的时候，假设实例中的属性是一个引用对象，clone()方法还能达到想要的目的吗？
 * 2:clone()方法是Object的类方法，为什么是Cloneable接口的子类才可以使用clone()方法？如果
 * 必须是Cloneable接口的子类才可以使用clone()方法，那么Object是否实现了Cloneable接口？
 * 3:创建新的实例对象，在Java中除了通过new关键字，clone()方法，还可以怎么实现？
 *
 * Created by JiaShun on 2018/9/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypeTest {
    @Test
    public void testPrototype(){
        Container container = new Container();
        PearlMilkTea pearlMilkTea = new PearlMilkTea();
        PuddingMilkTea puddingMilkTea = new PuddingMilkTea();
        JDMilkTea jdMilkTea = new JDMilkTea();
        container.register("pear",pearlMilkTea);
        container.register("pudding", puddingMilkTea);
        container.register("liuQiangDong",jdMilkTea);
        MilkTea pear = container.create("pear");
        pear.make("pear");
        MilkTea pudding = container.create("pudding");
        pudding.make("pudding");
        MilkTea lqd = container.create("liuQiangDong");
        lqd.make("jingDong");
    }
}
