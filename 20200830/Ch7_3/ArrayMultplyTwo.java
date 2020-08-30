/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class ArrayMultplyTwo implements UnaryOperator<Integer> {
	public Integer apply(Integer v){
	    return v * 2;
	}
}
