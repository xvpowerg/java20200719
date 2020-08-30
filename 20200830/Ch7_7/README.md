# 內部類 Inner class
## 內部類特性
1. 內部類主要作用是方法開發人員不用再創新的.java檔
2. 可以很方便的在介面或類別內快速覆寫類別或實作介面
3. 可使用所有的修改權限如private protected

## 內部類分為
- 靜態內部類
- 非靜態內部類
- 匿名內部類(anonymous inner class)

### 靜態內部類
注意`靜態內部類不可讀取外部非靜態屬性`
靜態內部類ex:
```java
public class Ch7_7 {
......
    private static class MyCondition implements Predicate<Integer>{
	int condition;
	 MyCondition(int condition){
	    this.condition = condition;
	}
	public boolean test(Integer v){	    
	    return v > condition;
	}
    }
 .....  
}    
```
### 非靜態內部類

### 匿名內部類
