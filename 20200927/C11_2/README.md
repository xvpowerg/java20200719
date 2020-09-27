# 泛型(二)
## ? extends 特性
* 必須是 extends 類型的子類或一樣
*  不可新增內容
* 可以取得數值，取得類型與泛型extends的類別相同
* 主要用來顯示資料
```java
    static void testList(List<? extends Test2> list){
	for (Test2 t2 : list){
	    System.out.println(t2);
	}
    }
```
## ? super 特性
* 必須是 super 類型的父類或一樣
* 可以新增 但是新增類型只能是 super 後的子類型或一樣
* 也可以取值 類型是Object
```java
    static void testSuper(List<? super Test2> list){	
	Test3 t1 = new Test3();
	list.add(t1);
	for (Object t :list ){
	    System.out.println(t);
	}
    }

```
