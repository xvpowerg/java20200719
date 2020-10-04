# collect
* 可以把filter好的內容 轉換為某個集合
```java
	list = list.stream().filter(st->st.getScore() < 90).
//		    collect(Collectors.toList());
//	System.out.println(list);
```
```java
* 取得群組
  ```java
  Map<Integer,List<Student>> group =
	   list.stream().collect(Collectors.groupingBy((st)->st.getScore()/10));
      System.out.println(group);
   System.out.println(group.get(7));
```   
* 將Stream輸出字串
```java

Collectors.joining() 必須使用在stream內容都是字串
   //希望輸出Name:Ken,Vivin,Lindy,Tom. 以上格式字串 可使用Collectors.joining(",","Name:",".")
   String names =   list.stream().map(st->st.getName()).
	     collect(Collectors.joining(",","Name:","."));
   System.out.println(names);

```
* 二分法群組
```java
   Map<Boolean,List<Student>> group2 =  list.stream().
	      collect(Collectors.partitioningBy(st->st.getScore() >80));
   System.out.println(group2);

```
   
   
