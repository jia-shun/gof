package org.js.gof.template;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 动物园运动会，小白兔和小乌龟赛跑，各围着跑到跑5圈
 * @Author: JiaShun
 * @Date: 2018/9/6 22:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplateTest {
    @Test
    public void testTemplate(){
        AbstractZooRun rabbit = new RabbitRun();
        AbstractZooRun tortoise = new TortoiseRun();
        rabbit.match();
        tortoise.match();
    }
}
