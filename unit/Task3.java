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
public class Task3 {
    private static int[] array1 = new int[5];
    private static int[] array2 = new int[5];
    private static int[] array3 = new int[10];
    
    public static void main(String[] args) {
        setArray1();
        setArray2();
        setArray3(array1, array2);
        printArrays();
    }
    
    public static void setArray1(){
        System.out.println("1 ci massive ededleri daxil edin:");
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            array1[i] = scanner.nextInt();
        }
    } 

    public static void setArray2(){
        System.out.println("2 ci massive ededleri daxil edin:");
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            array2[i] = scanner.nextInt();
        }
    }
    
    public static void setArray3(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 5; j < arr2.length + arr1.length; j++){
                array3[i] = arr1[i];
                array3[j] = arr2[j-5];
            }
        }
    }
    
    public static void printArrays() {
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Array3: " + Arrays.toString(array3));
    }
        
}
