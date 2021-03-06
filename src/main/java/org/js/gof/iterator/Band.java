package org.js.gof.iterator;

import java.util.ArrayList;

/**
 * @author JiaShun
 * @date 2018/9/3 22:08
 */

public class Band implements Aggregate{
    private ArrayList<Musician> musicians;

    public Band(int init){
        this.musicians = new ArrayList(init);
    }


    public void add(Musician musician) {
        musicians.add(musician);
    }

    public int getLength() {
        return musicians.size();
    }

    public Musician getMusicianAt(int index) {
        return musicians.get(index);
    }

    @Override
    public MyIterator iterator() {
        return new BandIterator(this);
    }
}
