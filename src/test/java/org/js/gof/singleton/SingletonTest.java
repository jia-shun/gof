package org.js.gof.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: JiaShun
 * @Date: 2018/9/11 22:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonTest {

    @Test
    public void testLazySingleton(){
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        if(lazy1 == lazy2){
            System.out.println("lazy1和lazy2是同一个对象");
        } else {
            System.out.println("lazy1和lazy2不是同一个对象");
        }
    }

    @Test
    public void testStarveSingleton(){
        StarveSingleton starve1 = StarveSingleton.getInstance();
        StarveSingleton starve2 = StarveSingleton.getInstance();
        if(starve1 == starve2){
            System.out.println("starve1和starve2是同一个对象");
        } else {
            System.out.println("starve1和starve2不是同一个对象");
        }
    }

    @Test
    public void testDoubleLockSingleton(){
        DoubleLockSingleton doubleLock1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton doubleLock2 = DoubleLockSingleton.getInstance();
        if(doubleLock1 == doubleLock2){
            System.out.println("doubleLock1和doubleLock2是同一个对象");
        } else {
            System.out.println("doubleLock1和doubleLock2不是同一个对象");
        }
    }

    @Test
    public void testStaticInnerClassSingleton(){
        StaticInnerClassSingleton staticInnerClass1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClass2 = StaticInnerClassSingleton.getInstance();
        if(staticInnerClass1 == staticInnerClass2){
            System.out.println("staticInnerClass1和staticInnerClass2是同一个对象");
        } else {
            System.out.println("staticInnerClass1和staticInnerClass2不是同一个对象");
        }
    }
}
