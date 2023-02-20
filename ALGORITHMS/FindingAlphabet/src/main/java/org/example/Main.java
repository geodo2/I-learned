package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[26];

        for(int i=0; i< arr.length; i++){
            arr[i]= -1;

        }

        String some = in.nextLine();
        for(int i=0 ; i<some.length(); i++){
            char check=some.charAt(i);

            if(arr[check- 'a'] == -1){
                arr[check - 'a'] =i;
            }

        }
        for (int val : arr){
            System.out.println(val+ " ");
        }
    }
}