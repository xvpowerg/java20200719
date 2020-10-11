/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
public class Ch13_1 {
    
    public static void main(String[] args) throws IOException {
	Path path =  Paths.get("c:", "mydir");
	Stream<Path> stream =  Files.walk(path);
	stream.forEach(System.out::println);
	
    }
    
}
