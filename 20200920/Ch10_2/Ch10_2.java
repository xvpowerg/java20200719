/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.Map;
import java.util.HashMap;
public class Ch10_2 {


    public static void main(String[] args) {
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
	//Key如果存在 merge的行為
	// 會依照BiFunction的行為去合併Map
	hashMap.merge(19, "K5",(oldValue,newValue)->oldValue+newValue );
	System.out.println(hashMap);
	//Key如果不存在 merge的行為
	//會將merge的value寫回Map
	hashMap.merge(60, "K9",(oldValue,newValue)->oldValue+newValue );
	System.out.println(hashMap);
    }
    
}
