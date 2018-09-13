package org.js.gof.adapter;

import org.js.gof.adapter.inherit.Computer;
import org.js.gof.adapter.inherit.ElectricAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 继承模式
 * 电脑本来不能playGame，但加上电源适配器就可以开机玩游戏了
 * @Author: JiaShun
 * @Date: 2018/9/6 22:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterExtentsTest {

    @Test
    public void testExtendsAdapter(){
        Computer computer = new ElectricAdapter();
        computer.playGame();
    }

}
