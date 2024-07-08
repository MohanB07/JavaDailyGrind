import java.util.Scanner;
public class CoinGame {

    public void prediction(int arr[]){
        int sum = 0; int minStart = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum < 1){
                sum = -sum;
                minStart = minStart + sum;
                sum = 0;
            }
        }
        System.out.println("The minimum to start the game is : " + minStart);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========COIN GAME PREDICTION==========\n");

        /* n values are to be given, in which positive values denote profit in the game and
        negative values denote loss. the output will the minimum amount to start the game to avoid loss */

        System.out.println("Provide number of games to play : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Provide the profit and loss in the game : ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }

        CoinGame cg = new CoinGame();
        cg.prediction(arr);

        input.close();
    }
}
