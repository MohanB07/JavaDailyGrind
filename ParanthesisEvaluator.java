import java.util.ArrayList;
import java.util.Scanner;
public class ParanthesisEvaluator {

    public int evaluator(String str){
        ArrayList<Character> LastOpenIndex = new ArrayList<Character>();
        int openInd = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '<'){
                LastOpenIndex.add(str.charAt(i));
                openInd = openInd + 1;
            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')' || str.charAt(i) == '>'){
                if( LastOpenIndex.get(openInd - 1 ).equals(str.charAt(i)) ){
                    return -1;
                }
                openInd = openInd - 1;
                LastOpenIndex.removeLast();
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* This problem inputs a String of parenthesis and checks whether it is logically valid or not */

        System.out.println("\n\t==========PARENTHESIS CHECKING==========\n");

        System.out.println("Provide a String of parenthesis :");
        String str = input.nextLine();

        ParanthesisEvaluator pe = new ParanthesisEvaluator();
        int res = pe.evaluator(str);
        System.out.println(res);
        if(res == 0){
            System.out.println("It is a valid Parenthesis string");
        } else {
            System.out.println("It is not valid Parenthesis string");
        }

        input.close();
    }
}
