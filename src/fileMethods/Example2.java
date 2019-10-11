package fileMethods;

import java.nio.file.Files;
import java.nio.file.Path;

//writeString
//This method is used to write the contents to a file
//readString
//This method will read all contents from a file into a string,
public class Example2 {
    public static void main(String[] args) throws Exception{
        Files.writeString(Path.of("simple.text"), "Hello!");
        System.out.println(Files.readString(Path.of("simple.text")));
        System.out.println(Files.isSameFile(Path.of("simple.text"),Path.of("simple.text")));
    }
}
