/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.HashMap;
public class Ch10_1 {

    public static void main(String[] args) {
	//Map 是一組key 與 value
	//HashMap<K,V>
	HashMap<Integer,String> map = new HashMap<>();
	//寫入map使用put
	map.put(25, "Howard");
	map.put(10, "Vivin");
	map.put(20, "Join");
	//取得map使用get
	System.out.println(map.get(10));
	//key如果重複會覆蓋value
	map.put(10, "Lucy");
	System.out.println(map.get(10));
	//如果key不存在就put
	//containsKey key存在回傳true 如果key不存在回傳flase
	int key = 13;
	if (!map.containsKey(key)){
	    System.out.println("不存在Key");
	    map.put(key, "Yumi");
	}else{
	    System.out.println("存在Key");
	}
	// java8開始提供 putIfAbsent 如果key不存在 就將value寫入map	
	map.putIfAbsent(16, "Iris");
	map.putIfAbsent(20, "Gigi");
	System.out.println(map);	
    }
    
}
