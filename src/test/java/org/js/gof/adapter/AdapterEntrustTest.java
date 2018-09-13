package org.js.gof.adapter;

import org.js.gof.adapter.entrust.AbstractComputer;
import org.js.gof.adapter.entrust.ElectricAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 委托模式
 * 电脑本来不能playGame，但加上电源适配器就可以开机玩游戏了
 * @Author: JiaShun
 * @Date: 2018/9/6 22:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterEntrustTest {
    @Test
    public void testEntrustAdapter(){
        AbstractComputer computer = new ElectricAdapter();
        computer.playGame();
    }
}
