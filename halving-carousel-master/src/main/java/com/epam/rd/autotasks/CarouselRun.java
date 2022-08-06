package com.epam.rd.autotasks;

public class CarouselRun {
    protected final int[] array = DecrementingCarousel.array.clone();
    protected int position = 0;
    public int next() {

        //throw new UnsupportedOperationException();
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        return array[position++]--;
    }

    public boolean isFinished() {

        //throw new UnsupportedOperationException();
        for (int el : array)
            if (el > 0)
                return false;
        return true;
    }


}
