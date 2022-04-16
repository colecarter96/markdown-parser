//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class MarkdownParse {

    public static ArrayList<String> getLinks(String[] markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        
        for(int i = 0; i < markdown.length; i ++){
            int currentIndex = 0;
           
                int openBracket = markdown[i].indexOf("[", currentIndex);
                int closeBracket = markdown[i].indexOf("]", openBracket);
                int openParen = markdown[i].indexOf("(", closeBracket);
                int closeParen = markdown[i].indexOf(")", openParen);
                
                
                
                if(closeBracket > 0){
                    toReturn.add(markdown[i].substring(openParen + 1, closeParen));
                }
                currentIndex = closeParen + 1;
                
                openBracket = 0; 
                closeBracket = 0; 
                closeBracket = 0;
                openParen = 0;
            
        }
        
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        String[] arr = content.split("\n");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        ArrayList<String> links = getLinks(arr);
        
	    System.out.println(links);
    }
}