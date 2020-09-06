# 非靜態的的method reference使用方式
```主要用途當lambda過於複雜時，可使用method reference取代lambda```
## 實作步驟
1. 觀察 Function Interface參數類型與數量
2. 觀察 Function Interface回傳的類型
3. 依照1步驟與2步驟寫一個參數類型與數量、回傳類型都一樣的方法
4. 使用第3步驟產生的方法 撰寫method reference
5. 如果是靜態的method reference使用方式 類別名稱::方名稱
6. 如果是非靜態的的method reference使用方式 物件::方名稱
7. 如果是建構式 物件::new
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
