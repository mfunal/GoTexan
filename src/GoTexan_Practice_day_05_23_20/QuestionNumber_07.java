package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_07 {
    /*
    Swap two int variables' values without using a third variable
    */
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
