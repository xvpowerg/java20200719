/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Supplier;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch7_1 {    
    private static boolean numberInArray(int[] array,int n){
	for (int v :array){
	   if(v ==n) return true;
	}
	 return false;
    }
    static int[] lotto(int len,Supplier<Integer> numberGen){
	int[] lottos = new int[len];
	int index = 0;
	while(index < len){
	    int n = numberGen.get();
	    //檢查是否有重複的數字在陣列內
	    if (!numberInArray(lottos,n)){
		lottos[index++] = n;
	    }
	}
	Arrays.sort(lottos);
	return lottos;
    }
    
    public static void main(String[] args) {
	MyLotto myLotto = new MyLotto();
	int[] newLotto =  lotto(7,myLotto);	
	for (int i : newLotto){
	    System.out.print(i+" ");
	}
    }
    
}
