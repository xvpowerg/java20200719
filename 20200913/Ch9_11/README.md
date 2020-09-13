# 使用comparing方法做排序

```java
//comparing 回傳要排序的物件
	//thenComparing 回傳要排序的物件
// reversed()由大到小 遞減排序
	Comparator<Product> cp =
		Comparator.<Product,String>comparing(p->p.getName()).
			thenComparing(p->p.getPrice()).
			thenComparing(p->p.getLocation()).reversed();	

```
