package Array;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str = sc.next();
        String s = "";
        for(int i=Str.length()-1; i>=0; i--){
            s += Str.charAt(i);
        }
        System.out.println(s);
    }
}
