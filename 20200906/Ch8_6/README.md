# 使用lambda語法變形
## Function Interface的方法無參數且有回傳值
### 介面內容
```java
       interface SpawnValue {
	    int spawn();
     }
```
### 標準寫法
```java
 SpawnValue sv1 =  ()->{
	    int ran = (int)(Math.random() * 1000); //0~999
	    return ran;
	};
```
### 簡寫1 記得移除 return

```java
SpawnValue sv2 =  ()->(int)(Math.random() * 1000); 
```
## Function Interface 的方法無參數且無回傳值
### 介面內容
```java
    interface PrintMsg {
	    void print();
     }
```
### 標準寫法
```java
PrintMsg pm1 = ()->{
		    System.out.println("Msg1");	
	};
```
### 簡寫1
```java
PrintMsg pm2 = ()-> System.out.println("Msg1");	
```