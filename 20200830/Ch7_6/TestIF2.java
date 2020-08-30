/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830.testdefault;

/**
 *
 * @author xvpow
 */
public interface TestIF2 {
       default void print(){
	System.out.println("TestIF 2");
    }
}
