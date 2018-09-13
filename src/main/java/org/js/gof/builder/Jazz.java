package org.js.gof.builder;

/**
 * @Author: JiaShun
 * @Date: 2018/9/13 22:38
 */
public class Jazz implements MakeSong {
    @Override
    public void writeLyric(String words) {
        System.out.println("写歌词，内容：" + words);
    }

    @Override
    public void compose(String composer) {
        System.out.println("作曲家 " + composer + " 正在作曲");
    }

    @Override
    public void arrange(String arranger) {
        System.out.println(arranger + " 使用钢琴进行编曲。。");
    }

    @Override
    public void recorder(String soundEngineer) {
        System.out.println(soundEngineer + " 正在录制这首爵士乐");
    }
}
