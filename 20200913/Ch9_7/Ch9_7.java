/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.HashSet;

public class Ch9_7 {

    public static void main(String[] args) {
	//Set 結構
	//Set 內容不可重複　無法使用index取值
	//Set 速度比List快 
	HashSet<Integer> set = new HashSet<>();
	set.add(95);
	set.add(15);
	set.add(700);
	set.add(15);
	set.add(81);
	set.add(62);
	set.forEach(System.out::println);
	
    }
    
}
