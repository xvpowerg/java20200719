# 使用lambda語法變形
## Function Interface 的方法參數有一組且有回傳值	
### 介面內容如下
```java
 interface MapToValue{
	int map(String v);
    }
```
### 標準
```java
MapToValue mp1 = (String str)->{
	    return str.hashCode();
	};
```
### 簡寫1  
`注意要移除return`
```java
MapToValue mp2 = (String str)-> str.hashCode();
```
### 簡寫2  
```java
MapToValue mp3 =  str->{
	    return str.hashCode();
	};
```
### 簡寫3
```java
MapToValue mp4 = str-> str.hashCode();
```
## Function Interface 的方法參數有兩組且有回傳值
### 介面內容
```java
interface Calculate{
	int calcu(int a,int b);
    }
```
### 標準
```java
Calculate c1 = (int x,int y)->{
	    return x + y;
	};
```
### 簡寫1  
`注意要移除return`
```java
Calculate c2 = (int x,int y)->x + y;
```
### 簡寫2  
```java
Calculate c3 = ( x, y)->{return x + y;};
```
### 簡寫3
```java
Calculate c4 = (x, y)-> x + y;
```
