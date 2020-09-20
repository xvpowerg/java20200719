# Map 應用練習
給一個產品List如下
```java
List<Item> list = new ArrayList<>();
	Item i1 = new Item(10,"Apple");
	Item i2 = new Item(30,"Gooogle");
	Item i3 = new Item(60,"Yahoo");
	Item i4 = new Item(50,"Amazon");
	Item i5 = new Item(25,"MS");
```
找出 產品金額為 30 50 60 的品名
## 如果只用for 迴圈輪巡List找
* 會很慢 最慢次數約為 要查找產品數量 * 所有產品數量
```java
    public static void  findPrice(List<Item> list, int price){
	for (Item it : list){
	    if (it.getPrice() == price){
		System.out.println(it.getName());
	    }
	}
    }
```
## 如果只用Map找
* 比較快快 所需要的次數等於產品數量
```java
  Map<Integer,String> myMap = new HashMap<>();
	for (Item it :list){
		myMap.put(it.getPrice(), it.getName());
	}
	System.out.println(myMap.get(30));
	System.out.println(myMap.get(50));
	System.out.println(myMap.get(50));
```