/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.Optional;
public class Ch11_9 {
    public static void main(String[] args) {
	Teacher t1 = new Teacher("aa",20);
	t1.getName().ifPresent((name)->{
	    if (name.length() < 3 || name.length() > 10){
		System.out.println("錯誤的姓名");
	    }else{
		System.out.println("name:"+name);
	    }		
	});
	
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
    //如果內容是null回傳預設值
    String value = nameOption.orElse("Empty");
    System.out.println(value);
    nameOption = Optional.ofNullable(null);//可放置null
    value = nameOption.orElse("Empty");
     System.out.println(value);
     //比較複雜的情況
   //如果Optional內容是null回傳Supplier的數值
     value =  nameOption.orElseGet(()->"Supplier Empty");
     System.out.println(value);
      //如果Optional內容是null 就拋出自訂例外
     nameOption.orElseThrow(()->new IllegalArgumentException("value is null"));
     
     
    }
    
}
