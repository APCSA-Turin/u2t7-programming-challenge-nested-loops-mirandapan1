package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String result = "";
    for (int i = 0; i < height; i++) {
        for (int j = 0; j <= i; j++) {
            result += "*";
        }
        if (!(i == height - 1)) {
            result += "\n";
        }
        
        
    }
    
return result;
    
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String result = "";
    for (int i = 0; i < height; i++) {
        for (int j = height; j > i; j--) {
            result += "*";        
        }
        if (!(i == height - 1)) {
            result += "\n";
        }
    }
    return result;
}

            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String result = "";
        if (!(height < 2 || width < 2)) {
                for (int i = 0; i < width; i++) {
                result += "*";        
            }
            result += "\n";
            for(int i = 0; i < height - 2; i++) {
                result += "*";
                for (int j = 0; j < width - 2; j++) {
                    result += " ";
                }
                result += "*\n";
            }        

            for (int k = 0; k < width; k++) {
                result += "*";        
            }
            
        }
        return result;
        
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String result = "";
        for (int i=0; i<rows;i++) {
            for (int j = 0; j < word.length(); j++) {
               int newIndex = (i+j)%word.length();
               result += word.substring(newIndex, newIndex+1);
            }
            if (!(i == rows - 1)) {
            result += "\n";
            }
          
        }
        
        return result;
    }

}