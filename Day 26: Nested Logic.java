import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        int size=6;
        int[] ar=new int[size];
        for(int i=0;i<6;i++){
            ar[i] = sc.nextInt();
        }
        int day=ar[0]-ar[3];
        int month=ar[1]-ar[4];
        int year=ar[2]-ar[5];
        int result= year < 0 ? 0
            : year> 0 ? 10000 
            : month < 0 ? 0
            : month > 0 ? month * 500
            : day < 0 ? 0
            : day > 0 ? day * 15 
            : 0;
        System.out.print(result);
    }
}
