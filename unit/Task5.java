/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oructarverdiyev
 */
public class Task5 {
    private static int[] array = new int[5];
    
    
    public static void main (String[] args) {
        setArray();
        setNewElement(array);
    }
    
    public static void setArray(){
        System.out.println("massive ededleri daxil edin:");
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            array[i] = scanner.nextInt();
        }
    }
    
    public static void setNewElement(int[] arr) {
        System.out.println("eded daxil edin:");
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int[] resultArray = new int[arr.length - 1];
        
        for(int i = 0; i<arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Silinenen element: " + arr[i] + " Indeksi: " + i);
            } else {
                resultArray[i] = arr[i];
            }
        }
        
        System.out.print(Arrays.toString(resultArray));
    }
    
    
    
}
