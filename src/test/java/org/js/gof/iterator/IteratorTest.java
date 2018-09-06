package org.js.gof.iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 一个乐队包含多位音乐家，遍历音乐家的名字
 * Created by JiaShun on 2018/9/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IteratorTest {
    @Test
    public void testIterator(){
        Band band = new Band(5);
        band.add(new Musician("Michael"));
        band.add(new Musician("Ackie"));
        band.add(new Musician("Tito"));
        band.add(new Musician("Jermaine"));
        band.add(new Musician("Marlon"));
        MyIterator myIt = band.iterator();
        while (myIt.hasNext()){
            Musician musician = (Musician)myIt.next();
            System.out.println(musician.getName());
        }
    }
}
