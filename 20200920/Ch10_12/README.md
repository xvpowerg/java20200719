# 限定方法參數只能是限定的泛型
## 語法
類別<? extends 類型> ?表示不清楚甚麼類別 只要是某類型或他的子類，就可通過泛型條件
```java
    public void testT(T  v,List<? extends Number> list){
	
    }
```
表示傳遞類testT的方法 第一個參數看宣告類別時指定，第二個參數限定能傳入的List的泛型只能是Number類型或是子類型