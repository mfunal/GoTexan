package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_01 {


    /*
    Please create a method prints the given string and a non-negative int n, return a larger string that is n copies of the original string.

    Examples:
    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */

public static String printTimes(String text, int count){
String result="";
    for(int i=0; i<count;i++){
        result+=text;
    } return result;
}

    public static void main(String[] args) {
        System.out.println(printTimes("hi",6));

        int n=3;
        String b="hi";

        String result="";
        for(int i=0; i<n;i++){
            result+=b;
        }
        System.out.println(result);

    }


}
