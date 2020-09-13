# List常用方法說明
List內有資料如下
```txt
100 52 13 25 
```
+ 插入方法 
```java
    nList.add(2, 68);
	    printList(nList); 輸出100 52 68 13 25 
```
+ 兩個List合併
```java
   ArrayList<Integer> nList2 = new ArrayList<>();
	    nList2.add(650);
	    nList2.add(256);
	    nList2.add(956);
	    nList.addAll(nList2);
	     printList(nList);輸出 100 52 68 13 25 650 256 956 
```
+ contains 是否有相對應的元素存在於List
```java
boolean find =  nList.contains(68);
System.out.println(find);//因為有68元素所以回傳true
find = nList.contains(756);
System.out.println(find); //因為沒有756元素所以回傳false
```
+ indexOf 會找到元素index如元素不存在回傳-1
```java
int index =  nList.indexOf(13);
System.out.println(index); //3 因為13的索引是3
index =  nList.indexOf(986);
 System.out.println(index); //-1 因為找不到986
```
+ remove 有兩個方法 一個是傳整數 一個是傳物件
  + 傳整數 參數是index
  + 傳物件 參數是List的內容
```java
//nList.remove(256);//因為index沒有到256 會拋出錯誤
nList.remove(Integer.valueOf(256));
printList(nList);
```
+ removeAll 批次移除 以下案例將nList 的13與650的數字移除
```java
 List<Integer> deList = new  ArrayList<>();
deList.add(13);
deList.add(650);
nList.removeAll(deList);
 printList(nList);
```
+ removeIf 符合條件移除 只要資料小於50的移除
```java
nList.removeIf(v->v<50);
printList(nList);
```
+ replaceAll 對list的所有元素做運算
```java
nList.replaceAll(v->v+2);//對List的所有元素+
printList(nList);
```	       

