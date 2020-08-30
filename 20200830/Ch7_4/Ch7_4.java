/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Predicate;
public class Ch7_4 {

    static void filter(Predicate<String> p,String ... values){	
	for (String v : values){
	    if (p.test(v)){
		System.out.print(v+" ");
	    }
	}
    }
    public static void main(String[] args) {
	FilterByStrLen fs = new FilterByStrLen(3);
	filter(fs,"Apple","IOS","Vivin","Golang","C#");	
    }
}
