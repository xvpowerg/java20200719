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
