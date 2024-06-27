import java.util.Scanner;

public class MagicSquare {

    static int rowSum(int arr[][], int rows, int cols){
        int temp = 0,rowTotal = 0;
        for(int i=0;i<rows;i++){
            if(temp != rowTotal){
                return 0;
            }
            rowTotal = 0; temp = 0;
            for(int j=0;j<cols;j++){
                temp = temp + arr[i][j];
            }
            rowTotal = temp;
        }

        return rowTotal;
    }

    static int colSum(int arr[][], int rows, int cols){
        int temp = 0,colTotal = 0;
        for(int i=0;i<rows;i++){
            if(temp != colTotal){
                return 0;
            }
            colTotal = 0; temp = 0;
            for(int j=0;j<cols;j++){
                temp = temp + arr[j][i];
            }
            colTotal = temp;
        }

        return colTotal;
    }

    static int diagSum(int arr[][], int rows, int cols){
        int leftDiagonal = 0, rightDiagonal = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i == j){
                    leftDiagonal = leftDiagonal + arr[i][j];
                }
                else if(( (i+j) == rows -1)){
                    rightDiagonal = rightDiagonal + arr[i][j];
                }
            }
        }


        if(leftDiagonal == rightDiagonal){
            return leftDiagonal;
        }

        return 0;
    }


    public void magicSquareOrNOT(int arr[][], int rows, int cols){

        int rowSum = rowSum(arr, rows, cols);
        int colSum = colSum(arr, rows, cols);
        int diagSum = diagSum(arr, rows, cols);

        if((rowSum == colSum) && (rowSum == diagSum)){
            System.out.println("It is an Magic Square");
        }
        else{
            System.out.println("It is not an Magic Square");
        }

    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t=======MAGIC SQUARE OR NOT========\n");

        System.out.println("Provide the rows and columns to be in the square : ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Provide the elements to be in the square : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = input.nextInt();
            }
        }

        MagicSquare  ms = new MagicSquare();
        ms.magicSquareOrNOT(arr, rows, cols);


        input.close();
    }
}
