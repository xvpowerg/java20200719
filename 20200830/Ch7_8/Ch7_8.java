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

    class TestInnerClass{
	private int value;
	public void setValue(int value){
	    this.value = value;
	}
	public int getValue(){
	    return value;
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
	ct .setValue(200);
	System.out.println(ct);
    }
    
}
