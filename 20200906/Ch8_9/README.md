# 非靜態的的method reference使用方式
```主要用途當lambda過於複雜時，可使用method reference取代lambda```
## Consumer介面內容
```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```
### StringToCharArray類別內容
```java
  public class StringToCharArray {
    public char[] strToCharArray(String str){
	return str.toCharArray();
    }
}
```
### Ch8_9類別內容
```java
    public static void main(String[] args) {
	//使用物件的method 產生method  reference
	StringToCharArray stc = new StringToCharArray();
	Function<String,char[]> f = stc::strToCharArray;
	char[] cArray = f.apply("Apple");
	System.out.println(cArray[0]);
	System.out.println(cArray[1]);
    }
```
