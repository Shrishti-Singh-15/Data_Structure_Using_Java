package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest_element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array - ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array - ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth element");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The result is - " + arr[k-1]);
    }
}
