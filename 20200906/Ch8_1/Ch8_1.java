/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Ch8_1 {
    static void test(int a,Predicate<Integer> p,
	    Consumer<Integer> trueMsg, 
	    Consumer<Integer> falseMsg){	
	if (p.test(a)){
	    trueMsg.accept(a);
	}else{
	    falseMsg.accept(a);
	}
    }
    //使用匿名內部類
    static void anymous(){
	//條件希望所有數值都是正整數
	//如果條件為true 是正整數
	//如果條件為false 不是正整數	
	Predicate<Integer> checkFunction = new Predicate<Integer>(){
	    public boolean test(Integer in){
		return  in > 0;
	    }
	};	
	Consumer<Integer> trueMsg = new Consumer<Integer>(){
	     public void accept(Integer v1){
		System.out.println(v1+"是正整數");
	    }
	};
	Consumer<Integer> errorMsg = new Consumer<Integer>(){
	    public void accept(Integer v2){
		System.out.println(v2+"不是正整數");
	    }
	};
	
	test(-20,checkFunction,trueMsg,errorMsg);
	
    }
    public static void main(String[] args) {
	anymous();
    }
    
}
