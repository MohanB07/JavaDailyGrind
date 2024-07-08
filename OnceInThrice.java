import java.util.HashMap;
import java.util.Scanner;

public class OnceInThrice {
    static int singleElement(int[] arr , int N) {
        
        HashMap<Integer,Integer> copy = new HashMap<Integer, Integer>();
        int ans;

        for(int n : arr){
            copy.put(n, copy.getOrDefault(n, 0) + 1);
        }

        for(int n : arr){
            if( copy.get(n) == 1){
                ans = n;
                return ans;
            }
        }

        return 0;
    }

    // static int singleElement(int[] arr , int N) {
    //     ArrayList<Integer> copy = new ArrayList<Integer>();
        
    //     for(int c : arr){
    //         copy.add(c);
    //     }

    //     boolean[] visited = new boolean[N];
    //     int ans = 0;

    //     for(int i=0;i<N;i++){
    //         int Count = 0;
    //         for(int j=i;j<N;j++){
    //             if(!visited[j]){
    //                 if(arr[i] == arr[j]){
    //                     visited[j] = true;
    //                     Count = Count + 1;
    //                 }
    //             }
    //         }
    //         if(Count == 1){
    //             ans = arr[i];
    //             return ans;
    //         }
    //     }
    //     return 0;
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========FIND ONCE IN THRICE==========\n");
        /*
         * Given an array of integers arr[] of length N, every element appears thrice
         * except for one which occurs once.
         * Find that element which occurs once.
         */

        System.out.println("Provide the number of elements : ");
        int N = input.nextInt();

        int arr[] = new int[N];
        System.out.println("Provide the number of elements : ");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int ans = singleElement(arr, N);
        System.out.println(ans);

        input.close();
    }
}
