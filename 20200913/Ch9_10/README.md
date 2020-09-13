# 使用lambda實作Comparator

```java
Comparator<Product> cp = (cp1,cp2)->{
	    int cmp = cp1.getName().compareTo(cp2.getName());
	  if (cmp != 0) return cmp;
	   cmp = cp1.getPrice() - cp2.getPrice();
	  if (cmp == 0) cmp = cp1.getLocation() - cp2.getLocation();
	    return cmp;
	};
```
