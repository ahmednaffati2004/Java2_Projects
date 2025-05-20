/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countwordshw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author manf2
 */
public class CountWordsHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String line= "";
        String s ="";
        
        int lineCount = 0 , WordsCount = 0 , CharecterCount = 0;
        try {
            FileReader fil = new FileReader("C:\\Any\\TestWordsCount.txt");
            BufferedReader br = new BufferedReader(fil);
            while((line = br.readLine())!=null){
            s += line + " ";
            lineCount++;
            }
            String s2[] = s.split(" ");
            WordsCount = s2.length;
            for(int i =0; i<s.length(); i++){
            if(s.charAt(i)!= ' ')
                CharecterCount++;
            }
        } catch (IOException ex) {
            
        }
        System.out.println("line Count : " +lineCount + 
                            "\nWordsCount : " + WordsCount+
                            "\nCharecterCount : " + CharecterCount);
    }
    
}
