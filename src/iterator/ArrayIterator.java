package iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator {

    private MenuItem[] array;
    private int index = 0;

    public ArrayIterator(MenuItem[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if(index<array.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = array[index];
        index++;
        return menuItem;
    }
}
