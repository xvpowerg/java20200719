/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch12_1 {
    public static void main(String[] args) {
	Student st1 = new Student("Ken",70);
	Student st2 = new Student("Lindy",80);
	Student st3 = new Student("Iris",76);
	Student st4 = new Student("Vivin",85);
	Student st5 = new Student("Tom",90);
	Student st6 = new Student("Lucy",98);
	List<Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	//可以把filter好的內容 轉換為某個集合
//	list = list.stream().filter(st->st.getScore() < 90).
//		    collect(Collectors.toList());
//	System.out.println(list);

//取得群組
   Map<Integer,List<Student>> group =
	   list.stream().collect(Collectors.groupingBy((st)->st.getScore()/10));
      System.out.println(group);
   System.out.println(group.get(7));
   //Collectors.joining() 必須使用在stream內容都是字串
   //希望輸出Name:Ken,Vivin,Lindy,Tom. 以上格式字串 可使用Collectors.joining(",","Name:",".")
   String names =   list.stream().map(st->st.getName()).
	     collect(Collectors.joining(",","Name:","."));
   System.out.println(names);
   //群組二分法 
      Map<Boolean,List<Student>> group2 =  list.stream().
	      collect(Collectors.partitioningBy(st->st.getScore() >80));
   System.out.println(group2);
    }
    
}

