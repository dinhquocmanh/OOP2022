/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa06025;

/**
 *
 * @author thedung
 */
public class DSA06025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void insertionSort(int arr[],int n){
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i-1;

            /* Di chuyển các phần tử có giá trị lớn hơn giá trị 
            key về sau một vị trí so với vị trí ban đầu
            của nó */
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            //for(int i)
        }
    }
}
