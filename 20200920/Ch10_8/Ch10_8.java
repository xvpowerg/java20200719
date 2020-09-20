/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.TreeMap;

public class Ch10_8 {
    public static void main(String[] args) {
	//TreeMap 排序的是Key
	TreeMap<Integer,String> treeMap = new TreeMap<>();
	treeMap.put(6, "Ken");
	treeMap.put(3, "Vivin");
	treeMap.put(9, "Lindy");
	treeMap.put(5, "Iiris");
	treeMap.put(2, "GIgi");
	
	treeMap.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
