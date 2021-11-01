/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit;

/*
 * @author oructarverdiyev
 */
public class Task1 {
    private static int ededler[] = {1, 30, 40, 50, 60, 70, 23, 20};
    
    public static void main (String[] args){
        System.out.println("Maksimum element: "+ findMaximum(ededler));
    }
    
    static int findMaximum(int arr[]){
        int low = 0;
        int high = arr.length - 1;
        int max = arr[low];
        for (int i = low; i <= high; i++){
            if (arr[i] > max) {
               max = arr[i];
            }
        }
        return max;
    }
}


