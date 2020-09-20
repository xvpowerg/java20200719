/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.List;
import java.util.ArrayList;
public class Ch10_12<T> {
    
    //如果傳入testT 方法 第二個參數必須是式List 且List泛型必須為Number或Number
    public void testT(T  v,List<? extends Number> list){
	
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	Ch10_12<Integer> ch1012 = new Ch10_12();
	List<Float> myList = new ArrayList();
	ch1012.testT(10, myList);
    }
    
}
