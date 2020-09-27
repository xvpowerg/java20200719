#  Optional
## Optional用來統一化避免null問題的方法
可使用以下方是建立新Optional 注意不可new
*  Optional.empty() 取得空白Optional
* Optional.of(args) 參數不可null
* Optional.ofNullable(args)參數可null

## Optional內的物件方法
* ifPresent 判定Optional數值是否為null
* get 可取值 如果 Optional數值為null會拋出錯誤
* ifPresent 如果Optional數值不是null會呼叫ifPresent參數的方法
```java
  if (nameOption.isPresent()){
	System.out.println(nameOption.get());
    }
```
* orElse 如果存在會回傳Optional內的數值 如果為null會回傳orElse的參數
```java
 nameOption = Optional.ofNullable(null);//可放置null
    value = nameOption.orElse("Empty");
     System.out.println(value);
```
```java
value =  nameOption.orElseGet(()->"Supplier Empty");
     System.out.println(value);
```
* orElseThrow  如果Optional內容是null 就拋出自訂例外
```java
  nameOption.orElseThrow(()->new IllegalArgumentException("value is null"));
```
