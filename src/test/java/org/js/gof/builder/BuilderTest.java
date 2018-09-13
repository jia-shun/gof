package org.js.gof.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 调用者只需要知道要做哪种类型的音乐即可，无需关注具体制作流程
 * @Author: JiaShun
 * @Date: 2018/9/13 22:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderTest {

    @Test
    public void testBuilder(){
        RockRoll rockRoll = new RockRoll();
        Producer rockRollProducer = new Producer(rockRoll);
        rockRollProducer.song();
        System.out.println("========================");
        Jazz jazz = new Jazz();
        Producer jazzProducer = new Producer(jazz);
        jazzProducer.song();
    }

}
