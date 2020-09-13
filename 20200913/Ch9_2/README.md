# List集合
`如何把一群資料 蒐集 分類 處理  這就是集合`
## 集合 常用到的介面
+ [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
+ [Set](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)
+ [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
## 先說明List
**List 很像陣列 只是他不需要給予長度**案例:
```java
List myList = new ArrayList();
	//add()新增內容到list
	myList.add(20);
	myList.add(15);
	myList.add(13);
	//get()取出list的內容
	//get(index)參數的index跟陣列一樣由0開始
	System.out.println(myList.get(1));
```
## List輪巡
+ 使用for loop 
```java 
for(int i =0; i<myList.size();i++){
System.out.print(myList.get(i)+" ");
}
```
+ 使用foreach loop
```java	
for( Object v : myList){
System.out.print(v+" ");
}
```
+ 使用foreach 方法
```java
myList.forEach(v->System.out.print(v+" "));
```
