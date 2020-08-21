package iterator.combination;

import java.util.Iterator;
import java.util.Stack;

public class CombinationIterator implements Iterator {

    private Stack stack;

    public CombinationIterator(Iterator iterator) {
        this.stack = new Stack();
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if(!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        Iterator iterator = (Iterator) stack.peek();
        if(iterator.hasNext()) {
            MenuCombination menuCombination = (MenuCombination) iterator.next();
            if(menuCombination instanceof MenuList){
                stack.add(menuCombination.createIterator());
            }
            return menuCombination;
        }
        return null;
    }
}
