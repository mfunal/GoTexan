package GoTexan_Practice_day_05_23_20;

import java.util.Scanner;

public class QuestionNumber_06 {

//    Please write a code to print middle char in a String variable. If it is even number middle two characters will be printed
//    Please use scanner to get String.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int middle=(str.length()/2);
        if(str.length()%2==0) {
            String result = str.substring(middle - 1, middle + 1);

            System.out.println(result);
        }else{
            System.out.println(str.charAt(middle));
        }

    }

}
