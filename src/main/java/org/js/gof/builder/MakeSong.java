package org.js.gof.builder;

/**
 * 制作歌曲的步骤
 * @Author: JiaShun
 * @Date: 2018/9/13 22:01
 */
public interface MakeSong {
    /**
     * 写歌词
     * @param words 歌词
     */
    void writeLyric(String words);

    /**
     * 作曲
     * @param composer
     */
    void compose(String composer);

    /**
     * 编曲
     * @param arranger
     */
    void arrange(String arranger);

    /**
     * 录音
     * @param soundEngineer
     */
    void recorder(String soundEngineer);
}
