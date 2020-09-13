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
