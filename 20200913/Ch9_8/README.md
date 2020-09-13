# TreeSet
## 特性
+ 可排序
+ 預設由小到大(遞增排序)
+ 寫入TreeSet的物件 可實作Comparable 不然有可能會拋出例外
## Comparable
案例如下
```java
public class Student implements Comparable<Student>{
    private int age;
    private String name;  
   .........
   //如果目前數值大於傳入的數值回傳正數
   //如果目前數值小於傳入的數值回傳負數
   //如果目前數值等於傳入的數值回傳0
   public int compareTo(Student st){
       if (age > st.getAge()){
	   return 1;
       }else if(age < st.getAge()){
	   return -1;
       }
       return 0;
   }
   ............
   getAge()
   
}

```
