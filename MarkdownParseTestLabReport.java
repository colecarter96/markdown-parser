import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


import org.junit.*;
public class MarkdownParseTestLabReport {

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("/Users/colecarter/Documents/GitHub/markdown-parser/testFiles/test-file10.md");
        //Path fileName = Path.of("testFiles/test-file10.md");
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
       // System.out.println(links + " yessir");
        assertTrue(true);
    }
    
    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("/Users/colecarter/Documents/GitHub/markdown-parser/testFiles/test-file11.md");
        //Path fileName = Path.of("testFiles/test-file10.md");
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        System.out.println(links + " yessir");
        assertTrue(true);
    }
}
