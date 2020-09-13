/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.TreeSet;
public class Ch9_8 {
    public static void main(String[] args) {
	//TreeSet 可排序 預設 由小到大 (遞增)
	
	TreeSet<Integer> tSte = new TreeSet<>();
	tSte.add(100);
	tSte.add(12);
	tSte.add(16);
	tSte.add(85);
	tSte.add(9);
	tSte.forEach(System.out::println);
	
    }
    
}
