package GoTexan_Practice_day_05_23_20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class QuestionNumber_09 {
//    replit #169
//    Create a method which gets a string and returns the word count of that string.

//    Example: wordCount("foo bar")
//    returns 2

//    wordCount("one two three")
//    returns 3



    public static int wordCount(String words) {
        int count=0;

        String [] arr= words.split(" ");
        count=arr.length;

    return count;
    }

    public static void main(String[] args) {
       int result=wordCount("one two three");
        System.out.println("First solution: "+ result);

        System.out.println("====================================================");

        String word="one two three four";


        char []arr1=word.toCharArray();// we converted words to characters in an array. [o, n, e,  , t, w, o,  , t, h, r, e, e,  , f, o, u, r]


        int count=1;

        for(int i=0; i<arr1.length;i++) {
            if (arr1[i] ==' ') { // at this time we counted each ' ' and added 1 more tp reach the count of words
                count++;
            }
        }
        System.out.println("Second solution: "+count);
    }
}
