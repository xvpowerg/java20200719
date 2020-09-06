# 使用new 的method  reference　多筆參數
## 實作步驟
1. 觀察 Function Interface 參數類型與數量
2. 觀察 Function Interface 必須有回傳 與回傳值類型
3. 由第1步驟 與 第2步驟 撰寫或是查看 是否有相同的建構子
4. 第1步驟影響 呼叫哪一組建構子，會依照參數的數量與類型去呼叫相對應的建構子，如無對應會出錯
5. 第2步驟影響 method  reference呼叫的類別
6. 注意　Function Interface 方法的參數的順序 必須與建構子相同
## ToMyPair介面內容
```java
   interface ToMyPair{
       MyPair toMyPair(int k,String v);
   }
```
## MyPair class 內容
``` 注意在此MyPair 建構子有兩個參數順序是 int String 與  ToMyPair介面的方法一致
```java
public class MyPair {
    private int key;
    private String value;
      public MyPair(){
	
    }
    public MyPair(int k,String v){
	this.key = k;
	this.value = v;
    }
    
    public String toString(){
	return key+":"+value;
    }
}
```
## 使用new 的method  reference
```java
  static void test(ToMyPair tp){
       MyPair myPair =  
	       tp.toMyPair(10, "Test New");
       System.out.println(myPair);
   }
    public static void main(String[] args) {
	test(MyPair::new);
    }
```
