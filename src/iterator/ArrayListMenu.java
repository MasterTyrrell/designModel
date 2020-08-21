package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMenu implements Menu {

    private ArrayList menuList;

    private ArrayListMenu(){

    }

    private ArrayListMenu(ArrayList menuList){
        this.menuList = menuList;
    }

    @Override
    public Iterator getIterator() {
        return menuList.iterator();
    }
}
