package iterator.combination;

import java.util.Iterator;

public class MenuCombinationTest {

    public static void main(String[] args) {
        MenuCombination menuList = new MenuList("早餐","");
        MenuCombination menuList1 = new MenuList("午餐","");
        MenuCombination menuList2 = new MenuList("晚餐","");
        menuList2.add(new MenuElement("红烧茄子","茄子"));
        menuList2.add(new MenuElement("西红柿炒蛋","鸡蛋，西红柿"));
        MenuCombination menuList3 = new MenuList("菜单","");
        menuList3.add(menuList);
        menuList3.add(menuList1);
        menuList3.add(menuList2);

        Iterator<MenuCombination> iterator =  menuList3.createIterator();
        while(iterator.hasNext()){
            iterator.next().printMenu();
        }

    }
}
