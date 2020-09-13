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
