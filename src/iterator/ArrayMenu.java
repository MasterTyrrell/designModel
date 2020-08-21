package iterator;

import java.util.Iterator;

public class ArrayMenu implements  Menu{

    private MenuItem[] array;

    private ArrayMenu(){

    }

    public ArrayMenu(MenuItem[] array){
        this.array = array;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(this.array);
    }
}

