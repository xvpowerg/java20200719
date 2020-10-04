# NIO2

## Files.copy  複製檔案
```java
Path path = Paths.get("c:", "MyDir","test.zip");
	Path targetPath = Paths.get("c:", "MyDir","test_copy.zip");
	//StandardCopyOption.REPLACE_EXISTING  就會覆蓋不會出錯
	//預設情況Files.copy 不可重複
	Files.copy(path, targetPath,StandardCopyOption.REPLACE_EXISTING);
```
## Files.lines 列出文字內容
```java

	Stream<String>  stream = Files.lines(msgPath);
	stream.forEach(System.out::println);
```
