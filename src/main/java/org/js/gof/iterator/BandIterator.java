package org.js.gof.iterator;

/**
 * @Author: JiaShun
 * @Date: 2018/9/3 22:08
 */
public class BandIterator implements MyIterator{
    private Band band;
    private int index;

    public BandIterator(Band band) {
        this.band = band;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < band.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Musician next() {
        Musician musician = band.getMusicianAt(index);
        index++;
        return musician;
    }
}
