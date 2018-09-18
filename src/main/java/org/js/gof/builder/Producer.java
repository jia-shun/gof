package org.js.gof.builder;

/**
 * @author JiaShun
 * @date 2018/9/13 22:28
 */
public class Producer {
    private MakeSong makeSong;
    public Producer(MakeSong makeSong){
        this.makeSong = makeSong;
    }

    public void song(){
        makeSong.writeLyric("如果有一天");
        makeSong.arrange("海青");
        makeSong.compose("海青");
        makeSong.recorder("海青");
    }
}
