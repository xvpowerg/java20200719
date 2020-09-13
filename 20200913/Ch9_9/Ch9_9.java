/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.TreeSet;
import java.util.Comparator;
public class Ch9_9 {
       static class MyComparator implements Comparator<Product>{
	   //如果p1 大於 p2 回傳正數
	   //如果p1 小於 p2 回傳負數
	   //如果p1 等於 p2 回傳0
	    public int compare(Product p1,Product p2){
		 int cmp = p1.getName().compareTo(p2.getName());
		  return cmp;
	     }
	}
    public static void main(String[] args) {
	// TODO code application logic here
	Product p1 = new Product("A1",100,2);
	Product p2 = new Product("A2",50,2);
	Product p3 = new Product("A3",61,2);
	Product p4 = new Product("A2",50,1);
	Product p5 = new Product("A1",60,2);
	Product p6 = new Product("A4",57,3);
	MyComparator mcp = new MyComparator();
	TreeSet<Product> set = new TreeSet<>(mcp);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	set.add(p6);
	set.forEach(System.out::println);
    }
    
}
