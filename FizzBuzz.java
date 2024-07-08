
import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

    public void checkFizzBuzz(int arr[]) {
        ArrayList<String> str = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 15) == 0) {
                str.add("FizzBuzz");
            } else if ((arr[i] % 3) == 0) {
                str.add("Fizz");
            } else if ((arr[i] % 5) == 0) {
                str.add("Buzz");
            } else {
                str.add(String.valueOf(arr[i]));
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========FIZZ BUZZ PROBLEM==========\n");
        /* integer array of n numbers, if a number in it is only divisible by 3 make the value as fizz
        or only divisible by 5 make it as buzz or by both make it as fizzbuzz otherwise retain the same value*/

        System.out.println("Provide number of values to be in array : ");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the values for the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        FizzBuzz fb = new FizzBuzz();
        fb.checkFizzBuzz(arr);

        input.close();

    }

}
