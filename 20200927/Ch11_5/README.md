# Stream 方法
以下都是Terminal方法

```java
資料如下
	 ArrayList<String> list = new ArrayList<>();
	 list.add("Howard");
	 list.add("Vivin");
	 list.add("Lindy");
	 list.add("Ken");
	 list.add("Tom");
```
## allMatch 
* 全部符合回傳true
* 只要一個不符合就短路
```java
boolean b1 = 
list.stream().peek(v->System.out.println("Peek:"+v)).allMatch(n->n.length() >2); //不會短路
	System.out.println(b1);
	boolean b2 = list.stream().peek(v->System.out.println("Peek:"+v)).
		allMatch(n->n.length() >3); //會短路
	System.out.println(b2);
```
## anyMatch
* 任一符合回傳true
* 只要一個符合就短路
## noneMatch
* 所有元素都不符合回傳true
* 只要一個符合就短路
