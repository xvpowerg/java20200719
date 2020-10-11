# NIO2
## walk
可輪巡目錄結構
```java
    public static void main(String[] args) throws IOException {
	Path path =  Paths.get("c:", "mydir");
	Stream<Path> stream =  Files.walk(path);
	stream.forEach(System.out::println);
    }
```
## 練習找到所有zip檔，輸出成string 如:Title:zzz.zip,xxx.zip,yyy.zip.
```java

String zipFiles = stream.filter(ph->{
	  Path fName =  ph.getFileName();
	    if(fName== null ||
	      fName.toString().indexOf(".zip") < 0)  return false;
	   return true;
	}).map(filePath->filePath.getFileName().toString()).
       collect(Collectors.joining(",", "Titile:", "."));
	System.out.println(zipFiles);
	//Title:zzz.zip,xxx.zip,yyy.zip.
```
