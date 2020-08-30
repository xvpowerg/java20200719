# 實驗如果實作的介面當中 default方法有重複名稱會產生錯誤
解決方案
1.  不要有重複的方法
2.  覆寫重複的方法

```java
public interface TestIF {
    default void print(){
	System.out.println("TestIF 1");
    }
}
```

```java
public interface TestIF2 {
       default void print(){
	System.out.println("TestIF 2");
    }
}
```
以下會發生錯誤
```java
public class Ch7_6 implements TestIF,TestIF2 {
    public static void main(String[] args) {
	Ch7_6 ch76 = new Ch7_6();
	ch76.print();
    }
}

```

覆寫可避免錯誤
```java
public class Ch7_6 implements TestIF,TestIF2 {
    //如果實作的介面當中 default方法有重複名稱
    //解決方案
    //1. 不要有重複的方法
    //2. 覆寫重複的方法
    public static void main(String[] args) {
	Ch7_6 ch76 = new Ch7_6();
	ch76.print();
    }
    public void print(){
	System.out.println("Ch7_6");
    }
}
```