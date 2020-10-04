/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;
public class Ch12_12 {

    public static void main(String[] args) throws IOException{
	// TODO code application logic here
	//Paths 取得 Path
	Path path = Paths.get("c:", "MyDir","test.zip");
	Path targetPath = Paths.get("c:", "MyDir","test_copy.zip");
	//StandardCopyOption.REPLACE_EXISTING  就會覆蓋不會出錯
	//預設情況Files.copy 不可重複
	Files.copy(path, targetPath,StandardCopyOption.REPLACE_EXISTING);
	Path msgPath = Paths.get("c:", "MyDir","msg.txt");
	Stream<String>  stream = Files.lines(msgPath);
	stream.forEach(System.out::println);
    }
    
}
