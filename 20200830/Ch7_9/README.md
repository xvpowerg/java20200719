#  匿名內部類
## 特性
- 可快速覆寫與實作介面
- 無須手動建立新的類別

## 匿名內部類覆寫類別方法範例

```java
public class Dog {
    public void bark(){
	System.out.println("汪汪!!");
    }
}
//匿名內部類
	Dog dog3 = new Dog(){
	 public void bark(){
	     System.out.println("支支!");
	 }
	};
```
## 匿名內部類實作介面範例

```java
    static void printArrays(Consumer<Integer> c,int ... array){
	for (int v : array){
	    c.accept(v);
	}
    }

//匿名內部類實作介面
	printArrays(new Consumer<Integer>(){
	  public void accept(Integer v){
	      System.out.print(v+" ");
	  }
	},6,8,9,10);
```

