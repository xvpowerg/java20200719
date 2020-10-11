/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;

/**
 *
 * @author xvpow
 */
public class Ch13_6 {
    
    static class Test1{
	private int x;
	//synchronized  加一把鎖
	//synchronized 此方法必須等到目前執行此方法的執行序完成,其他執行序才可執行
//	public synchronized void  test(){
//	    for(int i =1;i<=10;i++){
//		x++;
//		System.out.println(x);
//	    }
//	}
	////synchronized 使用區塊 加一把鎖
	public  void  test(){
	    System.out.println("Name out:"+Thread.currentThread().getName());
	    synchronized(this){		
		 for(int i =1;i<=10;i++){
		     System.out.println("Name Center:"+Thread.currentThread().getName());
		    x++;
		    System.out.println(x);
		}
	    }
	   System.out.println("Name End:"+Thread.currentThread().getName());
	}
    }
    
    public static void main(String[] args) {
	Test1 t1 = new Test1();
	Thread th1= new Thread(()->{
	    t1.test();
	},"Th1");
	Thread th2= new Thread(()->{
		t1.test();
	},"Th2");
	
	th1.start();
	th2.start();
	
	
    }
    
}
