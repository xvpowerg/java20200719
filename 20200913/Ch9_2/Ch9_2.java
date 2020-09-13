/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.List;
import java.util.ArrayList;
public class Ch9_2 {
    
    
    //如何把一群資料 蒐集 分類 處理  這就是集合
    public static void main(String[] args) {
	//集合 常用到的介面
	//List
	//Set
	//Map
	//List 很像陣列 只是他不需要給予長度
	List myList = new ArrayList();
	//add()新增內容到list
	myList.add(20);
	myList.add(15);
	myList.add(13);
	//get()取出list的內容
	//get(index)參數的index跟陣列一樣由0開始
	System.out.println(myList.get(1));
	//輪巡List
	//使用for loop 
	for(int i =0; i<myList.size();i++){
	    System.out.print(myList.get(i)+" ");
	}
	 System.out.println();
	//使用foreach loop
	for( Object v : myList){
	    System.out.print(v+" ");
	}
	 System.out.println();
	 // 使用foreach 方法
	 myList.forEach(v->System.out.print(v+" "));
	 System.out.println();
	 
    }
    
}
