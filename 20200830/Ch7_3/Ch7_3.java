/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.UnaryOperator;
public class Ch7_3 {
    static void calculateArray(int[] array,UnaryOperator<Integer> uo){
	for (int i =0; i< array.length;i++){
	    array[i] = uo.apply(array[i]);
	}
    }
    public static void main(String[] args) {
	ArrayMultplyTwo amt = new ArrayMultplyTwo();
	int[] array = {5,6,7,2,9};
	calculateArray(array,amt);
	for (int x :array){
	    System.out.print(x+" ");
	}
    }
    
}
