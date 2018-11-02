import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int sum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j ||i == 0 || i == 2){
                    sum += arr[i][j];
                }// if condition close
            }// second for loop close
        }// first for loop close
        return sum;
    }
    static int hourglassSum(int[][] arr) {
    int k = 3, len = arr.length,maxsum = -64, sum;
        int[][] sub = new int[3][3];
        int a = 0, b = 0;
        
        for(int start = 0; start < 4; start++){
             a =  start;
            for(int end = 0; end < 4; end++){
                b = end;
                for(int i = 0; i < k; i++){
                    if(end >= len || start >= len)
                        break;
                    for(int j = 0; j < k; j++){
                        if(end >= len || start >= len)
                            break;
                        sub[i][j] = arr[start][end];
                        end++;
                    }//fourth
                    end = b;
                    start++;
                }//third
                sum = sum(sub);
                if(sum > maxsum){
                    maxsum = sum;
                }    
                start = a;
            }//second
        }//first
        return maxsum;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        System.out.println(hourglassSum(arr));
    }
}
