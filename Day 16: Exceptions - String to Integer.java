import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
           int str=Integer.valueOf(S);
            System.out.println(str);
            }
        catch(Exception e){
            System.out.print("Bad String");
        }
    }
}
