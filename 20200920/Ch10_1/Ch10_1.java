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
    }
    
}
