/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

import java.util.function.Function;

/**
 *
 * @author xvpow
 */
public class Ch8_9 {
    public static void main(String[] args) {
	//使用物件的method 產生method  reference
	StringToCharArray stc = new StringToCharArray();
	Function<String,char[]> f = stc::strToCharArray;
	char[] cArray = f.apply("Apple");
	System.out.println(cArray[0]);
	System.out.println(cArray[1]);
    }
    
}
