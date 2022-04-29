import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;
import java.io.File;

import static org.junit.Assert.*;
public class MarkdownParseTest {
    

    @Test
    public void MarkdownParseTest(){
        assertEquals(1, 1);
    }

    @Test 
    public void MarkdownParseTest1() throws IOException{
        Path fileName = Path.of("/Users/colecarter/Documents/GitHub/markdown-parser/newTestFile.md");
        String content = Files.readString(fileName);
        String[] arr = content.split("\n");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        ArrayList<String> links = MarkdownParse.getLinks(arr);
        ArrayList<String> expLinks = new ArrayList<String>();
        expLinks.add("https://www.google.com/");
        //expLinks.add("https://www.yahoo.com/");
        assertEquals(links, expLinks);

    }
}
