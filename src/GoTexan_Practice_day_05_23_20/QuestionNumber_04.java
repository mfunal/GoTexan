package GoTexan_Practice_day_05_23_20;

public class QuestionNumber_04 {

//    Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int arr[]={2,3,5,6,99,76,34,21};
        int a=Integer.MIN_VALUE; // we are using this variable to determine max number when loop is working
        System.out.println(a);
        for(int i=0 ; i< arr.length;i++){

            if(a<arr[i]){
                a=arr[i];
            }
        }
        System.out.println(a);
        System.out.println("==========================");
        max(arr); // we used method
    }
    public static void max(int [] arr){
       int a=Integer.MIN_VALUE;
       for(int each : arr){
           if(each>a){
               a=each;
           }
       }
        System.out.println(a);
    }

}
