/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.LinkedList;
public class Ch9_6 {
    public static void main(String[] args) {
	// TODO code application logic here
	//常新增 刪除 修改 插入 等等 請使用LinkedList
	LinkedList<String> list = new LinkedList<>();
	//ArrayList 用於顯示資料
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.forEach(System.out::println);
    }
    
}
