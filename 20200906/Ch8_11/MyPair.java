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
public class MyPair {
    private int key;
    private String value;
      public MyPair(){
	
    }
    public MyPair(int k,String v){
	this.key = k;
	this.value = v;
    }
    
    public String toString(){
	return key+":"+value;
    }
}
