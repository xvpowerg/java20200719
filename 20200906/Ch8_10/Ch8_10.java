/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;
public class Ch8_10 {
	
     static List<String> stringArrayToList(Supplier<ArrayList> sp,
	     String ... values){
	   ArrayList list =  sp.get();
	   for (String v : values){
	       list.add(v);
	   }
	   return list;
     }
    public static void main(String[] args) {
	//使用new 的method  reference
	  //1. 觀察 Function Interface 參數類型與數量
	  //2. 觀察 Function Interface 必須有回傳 與回傳值類型
	  //3. 由第1步驟 與 第2步驟 撰寫或是查看 是否有相同的建構子
	    // 第1步驟 影響method  reference呼叫 建構子 參數 數量與類型
	    // 第2步驟 影響method  reference呼叫的類別
	    
	    //如果使用new 必須看建構式　是否
	    stringArrayToList(()->new ArrayList(),"AA","BB","CC");
	   List<String> list = stringArrayToList(ArrayList::new,"AA","BB","CC");
	   System.out.println(list);
    }
    
}
