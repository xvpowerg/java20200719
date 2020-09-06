/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

/**
 *
 * @author xvpow
 */
public class Ch8_11 {

   interface ToMyPair{
       MyPair toMyPair(int k,String v);
   }
   
   static void test(ToMyPair tp){
       MyPair myPair =  
	       tp.toMyPair(10, "Test New");
       System.out.println(myPair);
   }
    public static void main(String[] args) {
	// TODO code application logic here
	//test((k,v)->new MyPair(k,v));
	test(MyPair::new);
    }
    
    
    
}
