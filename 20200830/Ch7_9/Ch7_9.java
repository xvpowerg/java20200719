/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830.inner;

/**
 *
 * @author xvpow
 */
public class Ch7_9 {

    
    static void 超級好聲音(Dog dog){
	dog.bark();
    }
    static class MeowDog extends Dog {
	public void bark(){
	    System.out.println("喵~");
	}
    }
    
    public static void main(String[] args) {
	Dog dog1 = new Dog();
	超級好聲音(dog1);
	Dog dog2 = new MeowDog();
	超級好聲音(dog2);
	//匿名內部類
	Dog dog3 = new Dog(){
	 public void bark(){
	     System.out.println("支支!");
	 }
	};
	超級好聲音(dog3);
    }
    
}
