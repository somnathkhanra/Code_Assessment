
import java.lang.*;
import java.io.*;
import java.util.HashMap; 

import java.util.Iterator; 

import java.util.Set; 

import java.util.regex.Matcher; 

import java.util.regex.Pattern; 

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int printUniquedWords(String str) 

    {
        int count=0; 

        // Extracting words from string 

        Pattern p = Pattern.compile("[a-zA-Z]+"); 

        Matcher m = p.matcher(str); 

          

        // Map to store count of a word 

        HashMap<String, Integer> hm = new HashMap<>(); 

          

        // if a word found 

        while (m.find())  

        { 

            String word = m.group(); 

              

            // If this is first occurrence of word 

            if(!hm.containsKey(word)) 

                hm.put(word, 1); 

            else

                // increment counter of word 

                hm.put(word, hm.get(word) + 1); 

              

        } 

          

        // Traverse map and print all words whose count 

        // is  1 

        Set<String> s = hm.keySet(); 

        Iterator<String> itr = s.iterator(); 

  

        while(itr.hasNext()) 

        { 

            String w = itr.next(); 

              

            if (hm.get(w) == 1) 
                
                count++;
         
        }  
        return count; 
        

    } 

    public static void main (String[] args) throws java.lang.Exception
    {
            String str = "Ram is great and RamKrishna is also great"; 

                System.out.println( printUniquedWords(str));
                 
    }
}