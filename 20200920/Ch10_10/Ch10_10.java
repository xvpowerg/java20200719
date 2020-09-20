/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;

/**
 *
 * @author xvpow
 */
public class Ch10_10 {

  
    public static void main(String[] args) {
	MyList myList = new MyList();
	myList.add("Ken");
	myList.add("Vivin");
	myList.add("Lindy");
	myList.foreach(System.out::println);
	MyListInt myList2 = new MyListInt();
	myList2.add(10);
	myList2.add(20);
	myList2.foreach(System.out::println);
	
	MyListGen<Float> list = new MyListGen<>();
	list.add(50.6f);
	list.add(76.9f);
	list.add(86.5f);
	list.foreach(System.out::println);
	MyListGen<String> listStr = new MyListGen<>();
	listStr.add("Test1");
	listStr.add("Test2");
	listStr.add("Test3");
	listStr.foreach(System.out::println);
	
    }
    
}
