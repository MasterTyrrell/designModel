package iterator.combination;

import java.util.Iterator;

public class MenuElement extends MenuCombination {

    private String name;
    private String desc;

    public MenuElement(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void printMenu() {
        System.out.println("菜单名称："+this.name);
        System.out.print("菜单描述："+this.desc);
        System.out.println(" ");
    }

    @Override
    public Iterator createIterator(){
        return new NullIterator();
    }
}
