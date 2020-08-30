/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Function;
//使用Function分割字串並轉為大寫
public class StringToUpArray  implements Function<String,String[]>{
    private String delimiter;
    public StringToUpArray(String delimiter){
	this.delimiter = delimiter;
    }
    public String[] apply(String str){
	    return str.toUpperCase().split(delimiter);
    }
}
