/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;
import java.util.function.Predicate;
public class Ch8_12 {
   static void test1(Predicate<Integer> p,String msg,int ...v){
	boolean selected = false;
	for (int x :v){
	    if(p.test(x)){
		System.out.println(x);
		selected = true;
	    }
	}
	if (!selected){
	   System.out.println(msg); 
	}
    }   
    public static void main(String[] args) {
	//題目1
	test1(i-> i %2 == 0,"無偶數",8,9,10,2);
	test1(i-> i %2 == 0,"無偶數",1,7,11,13);
    }
    
}
