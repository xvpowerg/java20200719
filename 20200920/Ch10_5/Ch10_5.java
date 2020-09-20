/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Ch10_5 {

    public static void  findPrice(List<Item> list, int price){
	for (Item it : list){
	    if (it.getPrice() == price){
		System.out.println(it.getName());
	    }
	}
    }
    public static void main(String[] args) {
	
	List<Item> list = new ArrayList<>();
	Item i1 = new Item(10,"Apple");
	Item i2 = new Item(30,"Gooogle");
	Item i3 = new Item(60,"Yahoo");
	Item i4 = new Item(50,"Amazon");
	Item i5 = new Item(25,"MS");
	
	//找出 產品金額為 30 50 60 的品名
	list.add(i1);
	list.add(i2);
	list.add(i3);
	list.add(i4);
	list.add(i5);
//	findPrice(list,30);
//	findPrice(list,50);
//	findPrice(list,60);
	
    Map<Integer,String> myMap = new HashMap<>();
	for (Item it :list){
		myMap.put(it.getPrice(), it.getName());
	}
	System.out.println(myMap.get(30));
	System.out.println(myMap.get(50));
	System.out.println(myMap.get(50));
    }
    
}
