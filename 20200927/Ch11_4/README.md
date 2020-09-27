# Stream
## Stream 特性
* 不可重複使用
* 方法不會修改來源
* 分為 Lazy與Terminal類型
## 不可重複使用
```java
Stream<String> str = Stream.of("Ken","Vivin","Lindy","Join");
str.forEach(System.out::println); //Stream<String> str = Stream.of("Ken","Vivin","Lindy","Join");
//因重複使用所以產生錯誤
str.forEach(System.out::println);
```
## 不會修改來源
```java
 ArrayList<String> list = new ArrayList<>();
	 list.add("Howard");
	 list.add("Vivin");
	 list.add("Lindy");
	 list.add("Ken");
	 list.add("Tom");
	 //輸出是 Howard  Vivin Lindy 
	 list.stream().filter(v->v.length() >3).
	 forEach(System.out::println);
	 //最後List 的size不變
	 System.out.println(list.size());
```