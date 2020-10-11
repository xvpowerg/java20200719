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