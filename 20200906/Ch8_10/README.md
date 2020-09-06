# 使用new 的method  reference
## 實作步驟
1. 觀察 Function Interface 參數類型與數量
2. 觀察 Function Interface 必須有回傳 與回傳值類型
3. 由第1步驟 與 第2步驟 撰寫或是查看 是否有相同的建構子
4.第1步驟影響 會依照參數數量與類型呼叫相對應的建構子 
5.第2步驟影響 method  reference呼叫的類別
## Supplier介面內容
```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```
## 使用new 的method  reference
```因為Supplier 沒有參數 且 ArrayList 提供無參數建構子 所以可以使用以下方式呼叫 new 的method  reference```
```java
     static List<String> stringArrayToList(Supplier<ArrayList> sp,
	     String ... values){
	   ArrayList list =  sp.get();
	   for (String v : values){
	       list.add(v);
	   }
	   return list;
     }
   List<String> list = stringArrayToList(ArrayList::new,"AA","BB","CC");
	   System.out.println(list);
```
