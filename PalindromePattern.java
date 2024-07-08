import java.util.Scanner;
public class PalindromePattern {

    static Boolean isPalindrome(int temp[]){
        int siz = temp.length;
        int mid = siz/2;
        for(int i=0;i<mid;i++){
            if(temp[i] != temp[siz - 1 - i]){
                return false;
            }
        }

        return true;
    }

    public String pattern(int arr[][]){
        String found = "-1";
        int flag = 0;
        int temp[] = new int[arr.length];
        //row checking
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                temp[j] = arr[i][j];
            }
            if(isPalindrome(temp)){
                flag = 1;
                found = i + " R";
                return found;
            }
        }

        //column checking
        if(flag == 0){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    temp[j] = arr[j][i];
                }
                if(isPalindrome(temp)){
                    flag = 1;
                    found = i + " C";
                    return found;
                }
            }
        }

        if(flag == 0){
            found = "-1";
        }

        return found;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* a 2D array integers, check whether any row or column has palindrome pattern.
        if the matrix has more palindrome patterns then row has higher precedence than the columns,
        lesser index has higher precedence than the higher */

        System.out.println("\n\t==========PALINDROME PATTERN==========\n");

        System.out.println("Provide values for row and columns in array : ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int arr[][] = new int[rows][cols];

        System.out.println("Provide the values for the matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = input.nextInt();
            }
        }

        PalindromePattern  pp = new PalindromePattern();
        String ans  = pp.pattern(arr);
        System.out.println(ans);

        input.close();
    }
}
