/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.List;
import java.util.ArrayList;
public class Ch11_2 {
//? extends Test2 ���iadd���e��List
    //���i�H���o�ƭ�
    //�D�n�Ψ���ܸ��
    static void testList(List<? extends Test2> list){
	for (Test2 t2 : list){
	    System.out.println(t2);
	}
    }
    
    public static void main(String[] args) {
	List<Test2>  myList = new ArrayList<>();
	Test2 t2 = new Test2();
	Test2 t3 = new Test2();
	Test2 t4 = new Test2();
	
	myList.add(t2);
	myList.add(t3);
	myList.add(t4);
	testList(myList);
    }
    
}
