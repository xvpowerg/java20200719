# Enum說明
+ Enum其實是一個抽象類別 不由開發者手繼承與實現
```java
  enum Fruit{
	APPLE,
	KIWI,
	CHERRY
    }
```

+ Enum主要用來做限定:最適合用在switch由下列程式碼來說明:
```java
    public static void main(String[] args) {
	//case 的參數被限定為Fruit列舉內的物件
	Fruit fr = Fruit.KIWI;
	switch(fr){
	    case APPLE:
		System.out.println("APPLE!!");
		break;
	    case KIWI:
		System.out.println("KIWI");
		break;
	    case CHERRY:
		System.out.println("CHERRY");
		break;
	}
    }
```
+ APPLE KIWI CHERRY都是屬於 Fruit這個類別所建立的物件,只是他們的name 與 ordinal是不一樣虛擬碼如下:
```java
Fruit APPLE = new Fruit("APPLE",0);
	Fruit KIWI = new Fruit("KIWI",1);
	Fruit CHERRY = new Fruit("CHERRY",2);
```
