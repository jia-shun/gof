package org.js.gof.template;

/**
 * Created by JiaShun on 2018/9/6.
 */

public abstract class ZooRun {
    public abstract void start();
    public abstract void run(int i);
    public abstract void end();
    public final void match(){
        start();
        for(int i=1; i<=5; i++){
            run(i);
        }
        end();
    }
}
