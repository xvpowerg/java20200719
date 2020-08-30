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
public class Ch7_8 {
      private int data = 78;
      private static int staticData = 95;
      
      public String getMsg(){
	  return "Ch7_8";
      }
    class TestInnerClass{
	private int value;
	public void setValue(int value){
	    this.value = value;
	}
	public int getValue(){
	    return value;
	}
	
	public String toString(){
	    return value+":"+data+":"+staticData;
	}
         public String getMsg(){
	  return "TestInnerClass";
         }
	
	 public void printMsg(){
	     //會呼叫到內部類的方法
	     System.out.println(getMsg());
	     //指定要呼叫外部類的方法
	     //Ch7_8.this 表示外部類的物件
	     System.out.println(Ch7_8.this.getMsg());
	 }
	 
    }
    //用在非靜態方法中!!
    //大多數情況
    public void testClass(){
	TestInnerClass tc = new TestInnerClass();
	tc.setValue(100);
	System.out.println(tc.getValue());
    }
    public static void main(String[] args) {
	// TODO code application logic here
	Ch7_8 ch78 = new Ch7_8();
	ch78.testClass();
	
	Ch7_8.TestInnerClass ct = new Ch7_8().new TestInnerClass();
	ct.setValue(200);
	System.out.println(ct);
	
	ct.printMsg();
    }
    
}
