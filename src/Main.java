/*
import java.lang.reflect.Array;

public class Main {

    //Array[15,75] (1,,3,5,9,11,13,16)
    public static void main(String[] args)
    {
        int arr [] = {3,4,5,7,8,9,11,13};

        for (int i = 0 ;i < arr.length; i++){
            if ((i != arr.length-1) && (arr[i]+1 == arr[i+1])){
                continue;
            }

          else if ((arr[i]!=0 ) && i==0 ){
                System.out.println("0-" + (arr[i] -1) +",");
            }
            else if( arr[i] == 0){
                System.out.println((arr[i])+1 +"-" + (arr[i+1]-1)+",");
            }

            else if ( (i==arr.length-1) && (arr[i]!=100)){
                System.out.println(arr[i]+1 +"-100");
            }

            else if (arr[i] == 100 && i !=arr.length-1){
                System.out.println(arr[i-1]+1 +"-99");
            }

            else if (i != arr.length-1){
                System.out.println((arr[i]+1) + "-" + (arr[i+1]-1)+",");
            }
        }

    }
}
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int count = 0;
        int newCount=0;
        String binary = Integer.toBinaryString(n);
        int max = binary.length();
        System.out.println(binary);

        for (int i=0; i<=max-1; i++){

            System.out.println(binary.charAt(i));

            if (binary.charAt(i) == '1'){
                count++;
                newCount = Math.max(count,newCount);
            }
            else {
                count = 0;
            }
        }

        System.out.println("Count :" +newCount);
        scanner.close();
    }
}
