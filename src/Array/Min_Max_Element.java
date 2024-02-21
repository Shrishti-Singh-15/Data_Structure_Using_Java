package Array;

import java.util.Scanner;

public class Min_Max_Element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(arr[i] >= arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        int min = arr[0];
        int max = arr[size-1];
        System.out.println("Min - " + min + " Max - " + max);
    }
}
