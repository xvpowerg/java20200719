/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.Optional;
public class Ch11_9 {
    public static void main(String[] args) {
//	Teacher t1 = new Teacher(null,20);
//	if ( t1.getName().length() < 0 || t1.getName().length() > 10) {
//	    System.out.println("錯誤的姓名!");
//	}
// Optional用來統一化避免null問題的方法
  Optional<String> nameOption =   Optional.empty();
      // System.out.println(nameOption.get());
      //nameOption = Optional.of(null);//不可放置null
      nameOption = Optional.ofNullable("Ken");//可放置null
    if (nameOption.isPresent()){
	System.out.println(nameOption.get());
    }
    nameOption.ifPresent(System.out::println);      
    nameOption = Optional.ofNullable("Ken");//可放置null
    //如果內容不存在我要回傳的預設值
    String value = nameOption.orElse("Empty");
    System.out.println(value);
    nameOption = Optional.ofNullable(null);//可放置null
    value = nameOption.orElse("Empty");
     System.out.println(value);
    }
    
}
