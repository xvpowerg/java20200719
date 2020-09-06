/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;
import java.util.function.Consumer;
public class Ch8_8 {
      static void testMethod(Integer v){
	  System.out.println("Consumer 1:"+v);
      }
    //method reference
    //主要用途當lambda過於複雜時，可使用method reference取代lambda
    //method reference 步驟
    //1 觀察 Function Interface參數類型與數量
    //2 觀察 Function Interface回傳的類型
    //3 依照1步驟與2步驟寫一個參數類型與數量、回傳類型都一樣的方法
    //4 使用第3步驟產生的方法 撰寫method reference
       //如果是靜態的method reference使用方式 類別名稱::方名稱
       //如果是非靜態的的method reference使用方式 物件::方名稱
       //如果是建構式 物件::new
       
    public static void main(String[] args) {
	Consumer<Integer> c1 = Ch8_8::testMethod;
	c1.accept(10);
    }
    
    
}
