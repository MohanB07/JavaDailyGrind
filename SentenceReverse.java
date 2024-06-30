import java.util.Scanner;
public class SentenceReverse {

    public void printReverse(String str){
        int size = str.length();
        int end = size;
        for(int i=size-1;i>=0;i--){
            if(str.charAt(i) == ' '){
                for(int j=i+1;j<end;j++){
                    System.out.print(str.charAt(j));
                }
                System.out.print(" ");
                end = i;
            }
            else if(i == 0){
                for(int j=i;j<end;j++){
                    System.out.print(str.charAt(j));
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========REVERSING A SENTENCE==========\n");

        System.out.println("Provide a Sentence : ");
        String str = input.nextLine();

        SentenceReverse sr = new SentenceReverse();
        sr.printReverse(str);

        input.close();
    }
}
