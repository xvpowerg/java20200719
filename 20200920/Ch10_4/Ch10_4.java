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
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
	//Key 存在
	// compute 當Key存在 會執行BiFunction v2數值是目前Key所對應的value 
	//會將BiFunction的return 寫回Map
	hashMap.compute(15, (v1,v2)->{
	    System.out.println("compute Key存在:"+v1+":"+v2);
	    return "X5";}
	);
	System.out.println(hashMap);//{17=X5, 19=D4, 10=A1, 76=C3, 15=B2}
	
	//computeIfAbsent 當Key存在 不會執行Function 
	hashMap.computeIfAbsent(76, k->{
	    System.out.println("computeIfAbsent K:"+k);
	    return "Y6";
	});
	System.out.println(hashMap);//{19=D4, 10=A1, 76=C3, 15=X5}	
//	 computeIfPresent 當Key存在 會執行BiFunction 
//	//會將BiFunction的return 寫回Map	
	hashMap.computeIfPresent(19, (k1,k2)->{
	    System.out.println(k1+":"+k2);
	    return "G7";
	});
	System.out.println(hashMap);
    }
    
}
