package org.js.gof.template;

/**
 * @author JiaShun
 * @date 2018/9/6 21:01
 */
public abstract class AbstractZooRun {
    public abstract void start();
    public abstract void run(int i);
    public abstract void end();
    public final void match(){
        start();
        int size = 5;
        for(int i=1; i<=size; i++){
            run(i);
        }
        end();
    }
}
