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
## 非靜態內部類在一般方法中使用，根與用一般類別無異EX
```java
  public void testClass(){
	TestInnerClass tc = new TestInnerClass();
	tc.setValue(100);
	System.out.println(tc.getValue());
    }

```
## 再進靜態方中記得需先new起外部類才能使用如下
```java
public static void main(String[] args) {
Ch7_8.TestInnerClass ct = new Ch7_8().new TestInnerClass();
	ct .setValue(200);
	System.out.println(ct);

}

```
