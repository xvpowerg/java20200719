/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {
    static void test(int a,Predicate<Integer> p,
	    Consumer<Integer> trueMsg, 
	    Consumer<Integer> falseMsg){	
	if (p.test(a)){
	    trueMsg.accept(a);
	}else{
	    falseMsg.accept(a);
	}
    }
  
    static void useLambda(int a){
	test(a,  v->v >=0,
		i->System.out.println(i+"正整數"),
		k->System.out.println(k+"不是正整數"));
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	
	useLambda(-10);
    }
    
}
