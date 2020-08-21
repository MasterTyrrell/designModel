package iterator.combination;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuList extends MenuCombination {

    ArrayList<MenuCombination> arrayList;
    private String name;
    private String desc;

    public MenuList(String name,String desc){
        arrayList = new ArrayList<>();
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void printMenu() {
        System.out.println("菜单名称："+this.name);
        System.out.print("菜单描述："+this.desc);
        System.out.println("========================");
        System.out.println(" ");
        Iterator<MenuCombination> iterator = this.arrayList.iterator();
        while(iterator.hasNext()){
            iterator.next().printMenu();
        }
    }

    @Override
    public Iterator createIterator(){
        return new CombinationIterator(arrayList.iterator());
    }

    @Override
    public void add(MenuCombination menuCOmbination){
        arrayList.add(menuCOmbination);
    }
}
