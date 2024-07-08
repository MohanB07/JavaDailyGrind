import java.util.Scanner;
public class InsertionSort {
    static void display(int arr[]){
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sorting(int arr[]){
        System.out.println("\nThe sorting iterations : ");
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 & key <= arr[j]){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
            display(arr);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t===========INSERTION SORT==========\n");
        /* selection sort chooses either min or max element from the array and places it in its position */

        System.out.println("Provide the number of elements : ");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("Provide the elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        sorting(arr);

        input.close();
    }
}
