package com.epam.rd.autotasks;


public class DecrementingCarousel {

    private final int capacity;
    static int[] array;
    int index = 0;
    boolean isRun = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    public boolean addElement(int element){

        //throw new UnsupportedOperationException();
        if (element > 0 && index < capacity && !isRun) {
            array[index++] = element;
            return true;
        }
        return false;
    }

    public CarouselRun run(){

        //throw new UnsupportedOperationException();
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;

    }
}
