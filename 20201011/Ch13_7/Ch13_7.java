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
public class Ch13_7 {

      static class TestDeadLock{
	  synchronized void m1(TestDeadLock td){	      
	      td.m2();
	  }  
	  
	  synchronized void m2(){
	      System.out.println("m2!!!");
	  }
      }  
    
    
    public static void main(String[] args) {
	
	TestDeadLock td1 = new TestDeadLock();
	TestDeadLock td2 = new TestDeadLock();
	td1.m1(td2);
	td2.m1(td1);
	
    }
    
}
