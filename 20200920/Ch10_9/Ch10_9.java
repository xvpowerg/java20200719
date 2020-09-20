/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.TreeMap;
import java.util.Comparator;
public class Ch10_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Comparator<Item> comp = Comparator.
		<Item,Integer>comparing(v->v.getPrice()).
		thenComparing(v->v.getName());
	TreeMap<Item,Integer> map = new TreeMap(comp );
	Item i1 = new Item(10,"Apple");
	Item i2 = new Item(30,"Gooogle");
	Item i3 = new Item(60,"Yahoo");
	Item i4 = new Item(50,"Amazon");
	Item i5 = new Item(25,"MS");
	map.put(i1, 5);
	map.put(i2, 9);
	map.put(i3, 11);
	map.put(i4, 7);
	map.put(i5, 6);	
	System.out.println(map);
	
    }
    
}
