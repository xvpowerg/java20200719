# 測試TreeMap 自訂類別
只要符合以下條件之一就可排序
* 自訂類別實作Comparable
* 或是建立java.util.Comparator 排序器 再放入TreeMap建構式 如下
```java
Comparator<Item> comp = Comparator.
		<Item,Integer>comparing(v->v.getPrice()).
		thenComparing(v->v.getName());
	TreeMap<Item,Integer> map = new TreeMap(comp );
```
