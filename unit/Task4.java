/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author oructarverdiyev
 */
public class Task4 {
    private static int[] anArray;
    
    public static void main(String[] args) {
        list();
        print();
        getOddandEvenNumbers(anArray);
    }
    
    public static int[] list() {
        anArray = new int[10];
        for(int i=0;i<anArray.length;i++)
        {
            anArray[i] = randomFill();
        }
        return anArray;
    }  
        
    public static int randomFill() {
        return (new Random()).nextInt();
    }
    
    public static void print(){
        System.out.println(Arrays.toString(anArray));
    }
    
    public static void getOddandEvenNumbers(int[] arr) {
        System.out.println("Tek ededler:");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        
        System.out.println("\nCut ededler:");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
