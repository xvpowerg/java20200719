/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830.inner;
import java.util.function.Predicate;
import java.util.Arrays;
public class Ch7_7 {
    
    static int[] newArrayByCondition(Predicate<Integer> condition,int ... array ){
	int[] tmpArray  = new int[array.length];//4
	//tmpArray[0] = 8;
	//tmpArray[1] = 9;	
	int index = 0;
	for (int v : array){
	    if (condition.test(v)){
		tmpArray[index++] = v;
	    }
	}
	tmpArray = Arrays.copyOfRange(tmpArray, 0, index);	
	return tmpArray;
    }
    
    private static class MyCondition implements Predicate<Integer>{
	int condition;
	 MyCondition(int condition){
	    this.condition = condition;
	}
	public boolean test(Integer v){	    
	    return v > condition;
	}
    }
    
    public static void main(String[] args) {
	MyCondition mcon = new MyCondition(5);
	int[] newArray =  newArrayByCondition(mcon,5,6,8,9);
	for (int v : newArray){
	    System.out.print(v+" ");
	}
	
    }
    
}
