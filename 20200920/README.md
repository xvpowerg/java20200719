# 作業
## List如下
```java
List<Item> list = new ArrayList<>();
	Item i1 = new Item(10,"Apple");
	Item i2 = new Item(30,"Gooogle");
	Item i3 = new Item(60,"Yahoo");
	Item i4 = new Item(50,"Amazon");
	Item i5 = new Item(25,"MS");
	Item i6 = new Item(60,"KKBOX");
	Item i7 = new Item(30,"Spring");
	Item i8 = new Item(30,"Uber");
	Item i9 = new Item(50,"Foodpanda");
	list.add(i1);
	list.add(i2);
	list.add(i3);
	list.add(i4);
	list.add(i5);
	list.add(i6);
	list.add(i7);
	list.add(i8);
	list.add(i9);	
```
## 找出 產品金額為 30 50 60 的品名
* 使用merge 完成此功能
* 使用 computeIfAbsent 與 computeIfPresent完成此功能