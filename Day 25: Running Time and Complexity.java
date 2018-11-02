import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }        
        int c=0;
        for(int i=0;i<n;i++){
            if(ar[i]!=1){
            // checking the divisors of number till its square root, to reduce the running time
            for(int j=1;j*j<=ar[i];j++){
            if(ar[i]%j==0){
                c=c+1;
            }
            
        }
            if(c>1){
                System.out.println("Not prime");
            }
            else{
                System.out.println("Prime");
            }
            c=0;
        }
            else{ 
                System.out.println("Not prime");
            }
        }
    }
    }
    
