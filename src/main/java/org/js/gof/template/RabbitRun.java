package org.js.gof.template;

/**
 * @author JiaShun
 * @date 2018/9/6 22:01
 */
public class RabbitRun extends AbstractZooRun {
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
