/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Function;

public class Ch7_2 {
static String[] splitString(String  str,Function<String,String[]> function){
    return function.apply(str);
}
    public static void main(String[] args) {
	StringToUpArray strToUpArray = new StringToUpArray(",");
	String names = "Vivin,Ken,Join,Tom";
        String[] newStrArray =  splitString(names,strToUpArray);
	for (String v : newStrArray){
	    System.out.println(v);
	}
    }
}
