/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch10_7 {

  
    public static void main(String[] args) {
	
	HashMap<Item,Integer> map = new HashMap<>();
	Item i1 = new Item(10,"A");
	Item i2 = new Item(20,"B");
	Item i3 = new Item(30,"C");
	Item i4 = new Item(20,"B");
	
	System.out.println(i4.equals(i2));
	System.out.println(i4.hashCode());
	System.out.println(i2.hashCode());
	//顯示時 可顯示 Item的金額:名稱
	//如果金額與名稱一樣視為相同
	map.put(i1, 9);
	map.put(i2, 8);
	map.put(i3, 7);
	map.put(i4, 6);
	System.out.println(map);
	
	
    }
    
}
