/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Ch11_1 {

    public static void main(String[] args) {
	List<Item> list = new ArrayList<>();
	Item i1 = new Item(10,"Apple");
	Item i2 = new Item(30,"Gooogle");
	Item i3 = new Item(60,"Yahoo");
	Item i4 = new Item(50,"Amazon");
	Item i5 = new Item(25,"MS");
	Item i6 = new Item(60,"KKBOX");
	Item i7 = new Item(30,"Spring");
	Item i8 = new Item(30,"Uber");
	Item i9 = new Item(50,"Foodpanda");
	list.add(i1);
	list.add(i2);
	list.add(i3);
	list.add(i4);
	list.add(i5);
	list.add(i6);
	list.add(i7);
	list.add(i8);
	list.add(i9);	
	Map<Integer,List<Item>> itemMap = new HashMap<>();
	//merge
//	for (Item i : list ){
//	     int key =  i.getPrice();
//	     List<Item> itemGroup = new ArrayList<>();
//	     itemGroup.add(i);
//	     itemMap.merge(key, itemGroup, (ov,nv)->{
//		 ov.addAll(nv);
//		 return ov;
//	     });
//	}
// computeIfAbsent 與 computeIfPresent
    for (Item i : list ){
	  int key =  i.getPrice();
	  List<Item> itemGroup = new ArrayList<>();
	 itemGroup.add(i);
	
	 //key存在才執行
	 itemMap.computeIfPresent(key, (k,ov)->{
	     ov.addAll(itemGroup);
	     return ov;
	 });
	   //key不存在才執行
	 itemMap.computeIfAbsent(key, k->itemGroup);

    }
	
	System.out.println(itemMap);
	
    }
    
}
