/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830.inner;
import java.util.function.Consumer;
public class Ch7_9 {

    
    static void 超級好聲音(Dog dog){
	dog.bark();
    }
    static class MeowDog extends Dog {
	public void bark(){
	    System.out.println("喵~");
	}
    }
    
    static void printArrays(Consumer<Integer> c,int ... array){
	for (int v : array){
	    c.accept(v);
	}
    }
    public static void main(String[] args) {
	Dog dog1 = new Dog();
	超級好聲音(dog1);
	Dog dog2 = new MeowDog();
	超級好聲音(dog2);
	//匿名內部類覆寫物件
	Dog dog3 = new Dog(){
	 public void bark(){
	     System.out.println("支支!");
	 }
	};
	超級好聲音(dog3);
	
	//匿名內部類實作介面
	printArrays(new Consumer<Integer>(){
	  public void accept(Integer v){
	      System.out.print(v+" ");
	  }
	},6,8,9,10);
    }
    
}
