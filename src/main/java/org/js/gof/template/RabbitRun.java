package org.js.gof.template;

/**
 * Created by JiaShun on 2018/9/6.
 */

public class RabbitRun extends ZooRun{
    @Override
    public void start() {
        System.out.println("=====" + "小白兔开始跑" + "=====");
    }

    @Override
    public void run(int i) {
        System.out.println("| ===" + "小白兔跑第" + i + "圈" + "=== |");
    }

    @Override
    public void end() {
        System.out.println("=====" + "小白兔结束跑" + "=====");
    }
}
