/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
	//Key 不存在
	// compute 當Key不存在 會執行BiFunction 但是v2 為null
	//會將BiFunction的return 寫回Map
	hashMap.compute(17, (v1,v2)->{
	    System.out.println("compute Key不存在:"+v1+":"+v2);
	    return "X5";}
	);
	System.out.println(hashMap);//{17=X5, 19=D4, 10=A1, 76=C3, 15=B2}	
	// computeIfAbsent 當Key不存在 會執行Function 
	//會將Function的return 寫回Map
	hashMap.computeIfAbsent(80, k->{
	    System.out.println("computeIfAbsent K:"+k);
	    return "Y6";
	});
	System.out.println(hashMap);//{80=Y6, 17=X5, 19=D4, 10=A1, 76=C3, 15=B2}	
	// computeIfPresent 當Key不存在 不會執行BiFunction 
	//不會將BiFunction的return 寫回Map	
	hashMap.computeIfPresent(Integer.SIZE, (k1,k2)->{
	    System.out.println(k1+":"+k2);
	    return "G7";
	});
	System.out.println(hashMap);
    }
    
}
