/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.ArrayList;
public class Ch9_3 {

    public static void main(String[] args) {
	//List 集合當我沒有加上泛型時，寫入與取出都是Object類型,也就是甚麼都可寫入
	ArrayList myList = new ArrayList();
	myList.add("AAA");
	myList.add(56);
	myList.add(1.52);
	Object st = myList.get(0);
	//List 集合當有加上泛型時,被限定只能放入泛型指定的類型,泛型無基本型態
	//集合內無法放置基本型態，Java有幫我們做自動封箱所以才可直接放入基本型態
	ArrayList<Integer> ageList = new ArrayList<>();
	ageList.add(25);
	ageList.add(73);
	ageList.add(84);
	for (int v : ageList){
	    System.out.println(v);
	}
	
    }
    
}
