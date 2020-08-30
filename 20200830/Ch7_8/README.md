#  非靜態內部類
## 特性
可使用外部類的所有類型的屬性與方法
## 非靜態內部類EX
```java
public class Ch7_8 {
.....
    class TestInnerClass{
	private int value;
	public void setValue(int value){
	    this.value = value;
	}
	public int getValue(){
	    return value;
	}
	
	public String toString(){
	    return value+"";
	}
    }
    .....
}
```
## 非靜態內部類在一般方法中使用，與用一般類別無非別如下案例:
```java
  public void testClass(){
	TestInnerClass tc = new TestInnerClass();
	tc.setValue(100);
	System.out.println(tc.getValue());
    }

```
## 於靜態方中呼叫非靜態內部類請先new起外部類，才能使用如下案例:
```java
public static void main(String[] args) {
Ch7_8.TestInnerClass ct = new Ch7_8().new TestInnerClass();
	ct .setValue(200);
	System.out.println(ct);

}
```
## 如果內部類與外部類方法名稱一樣，若要呼叫外部類方法請用`外部類名.this.方法`
```java
public class Ch7_8 {
      public String getMsg(){
	  return "Ch7_8";
      }
    class TestInnerClass{
         public String getMsg(){
	  return "TestInnerClass";
         }
	 public void printMsg(){
	     //會呼叫到內部類的方法
	     System.out.println(getMsg());
	     //指定要呼叫外部類的方法
	     //Ch7_8.this 表示外部類的物件
	     System.out.println(Ch7_8.this.getMsg());
	 }
    }
    public static void main(String[] args) {
	Ch7_8.TestInnerClass ct = new Ch7_8().new TestInnerClass();
	ct.printMsg();
    }
    
}

```
