/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class FilterByStrLen implements Predicate<String>{
    private int len;
    public FilterByStrLen(int len){
	this.len = len;
    }
    public boolean test(String str){	
	return str.length() > len;
    }
}
