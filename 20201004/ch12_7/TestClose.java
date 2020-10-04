/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable {
    private boolean throwsEx = false;
    private String name;
	TestClose(String name,boolean throwsEx){
	    this.name = name;
	    this.throwsEx  = throwsEx;
	}
     public void close() throws Exception{
	 System.out.println("name:"+name);
	 if (throwsEx) throw new Exception("name:"+name);
     }
}
