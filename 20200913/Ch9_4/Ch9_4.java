/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.ArrayList;
import java.util.List;
public class Ch9_4 {
    public static void printList(List myList){
	for (Object obj: myList){
	    System.out.print(obj+" ");
	}
	System.out.println();
	  System.out.println("====================");
    }
        public static void main(String[] args) {
	    ArrayList<Integer> nList = new ArrayList<>();
	    nList.add(100);
	    nList.add(52);
	    nList.add(13);
	    nList.add(25); 
	    printList(nList);
	    //插入
	    nList.add(2, 68);
	    printList(nList);
	    //兩個List合併
	    ArrayList<Integer> nList2 = new ArrayList<>();
	    nList2.add(650);
	    nList2.add(256);
	    nList2.add(956);
	    nList.addAll(nList2);
	     printList(nList);
	}
}
