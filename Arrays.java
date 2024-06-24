import java.util.Scanner;

public class Arrays{

    static int[] Ascending(int arr[]){
        int size = arr.length;
        System.out.println("The List in Ascending Order : ");
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] Descending(int arr[]){
        int size = arr.length;
        System.out.println("The List in Descending Order : ");
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static void Average(int[] arr){
        float sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The average of the list is : " + (sum/arr.length));
    }

    static void PrimeOrNot(int arr[]){
        int size = arr.length;
        System.out.println("The Prime numbers in the list are : ");
        for(int i=0;i<size;i++){
            int count = 0;
            for(int j=2;j<arr[i];j++){
                if((arr[i] % j ) == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(arr[i]);
            }
        }
    }

    static void RemoveDuplicates(int arr[]){
        boolean[] visited = new boolean[arr.length];
        int size = arr.length;
        System.out.println("The List without Duplicates : ");
        for(int i=0;i<size;i++){
            if(!visited[arr[i]]){
                System.out.println(arr[i]);
            }
            visited[arr[i]] = true;
        }
    }

    static void alternateSumAndPro(int arr[]){
        int sum = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if((i%2) == 0){
                sum = sum + arr[i+1];
                System.out.println(sum);
            }
            else{
                sum = sum * arr[i+1];
                System.out.println(sum);
            }
        }
        System.out.println("The alternate sum and product is : " + sum);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        // Ascending(arr);
        // Descending(arr);

        // System.out.println("the elements are ");
        // for(int i : arr){
        //     System.out.println(i);
        // }

        // Average(arr);

        // PrimeOrNot(arr);
        // RemoveDuplicates(arr);

        alternateSumAndPro(arr);
        

        input.close();

    }
}