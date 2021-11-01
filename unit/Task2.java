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
public class Task2 {
    private static int[] anArray;
    
    public static void main(String[] args) {
        list();
        print();
        CountingEvenOdd(anArray);
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
    
    public static void CountingEvenOdd(int arr[]){
        int even_count = 0;
        int arr_size = arr.length;
 
        for (int i = 0; i < arr_size; i++) {
             
            if ((arr[i] % 2) == 0)
                even_count++;
        }
        System.out.println("Cüt rəqəmli elementlərin sayi" + " = " + even_count);
    }
    
    public static void print(){
        System.out.println(Arrays.toString(anArray));
    } 
  
}
