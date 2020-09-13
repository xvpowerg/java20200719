# 如何使用Comparator

+ 使用匿名內部類實作Comparator
```java
  static class MyComparator implements Comparator<Product>{
	   //如果p1 大於 p2 回傳正數
	   //如果p1 小於 p2 回傳負數
	   //如果p1 等於 p2 回傳0
	    public int compare(Product p1,Product p2){
		 int cmp = p1.getName().compareTo(p2.getName());
		  return cmp;
	     }
	}
```
