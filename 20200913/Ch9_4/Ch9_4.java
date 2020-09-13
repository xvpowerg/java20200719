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
	     //contains 是否有相對應的元素存在於List
	    boolean find =  nList.contains(68);
	    System.out.println(find);//因為有68元素所以回傳true
	     find = nList.contains(756);
	    System.out.println(find); //因為沒有756元素所以回傳false
	    //indexOf 會找到元素index如元素不存在回傳-1
	     int index =  nList.indexOf(13);
	      System.out.println(index); 
	     index =  nList.indexOf(986);
	      System.out.println(index); 
	    //
	    //remove 有兩個方法 一個是傳整數 一個是傳物件
	    //傳整數 參數是index
	    //傳物件 參數是List的內容
	    
	     //nList.remove(256);//因為index沒有到256
	    nList.remove(Integer.valueOf(256));
	    printList(nList);
	    //nList.removeAll
	    List<Integer> deList = new  ArrayList<>();
	    deList.add(13);
	    deList.add(650);
	    nList.removeAll(deList);
	    printList(nList);
	     //removeIf 符合條件移除
	    nList.removeIf(v->v<50);
	    printList(nList);
	     //replaceAll 對list的所有元素做運算
	     nList.replaceAll(v->v+2);
	       printList(nList);
	}
}
