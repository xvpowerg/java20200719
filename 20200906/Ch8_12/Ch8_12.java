/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
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
   
   static String[] arrayToUp(UnaryOperator<String> uo,String ... v){
       String[] tmpArray = new String[v.length];
       for (int i =0;i<v.length;i++){
	   tmpArray[i] = uo.apply(v[i]);
       }
      return tmpArray;
   }
   static String toUp(String st){
       return st.toUpperCase();
   }
    public static void main(String[] args) {
	//題目1
	test1(i-> i %2 == 0,"無偶數",8,9,10,2);
	test1(i-> i %2 == 0,"無偶數",1,7,11,13);
	//題目2
	String[] upArray =  arrayToUp(Ch8_12::toUp,"ken","vivin","lindy");
	System.out.println(upArray[0]);
	System.out.println(upArray[1]);
    }
    
}
