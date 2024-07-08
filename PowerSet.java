
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {

    static ArrayList<String> generatePowerSet(String str){
        ArrayList<String> a = new ArrayList<String>();

        for(int i=0; i<str.length();i++){
            String temp = str.valueOf(str.charAt(i));
            String res;
            for(int j=i;j<str.length();j++){
                if(str.length() == 1){
                    a.add(temp);
                    return a;
                }
                else if (i == str.length() -1) {
                    String last = str.valueOf(str.charAt(0));
                    res = last + temp;
                    a.add(temp);
                    if(a.contains(res)){
                        continue;
                    }
                    a.add(res);
                }
                else {
                    if(i == j){
                        a.add(temp);
                    }
                    else{
                        res = str.substring(i, j+1);
                        a.add(res);
                    }
                }
            }
        }
        // Collections.sort(a);
        return a;
    }

    public ArrayList<String> AllPossibleCombinations(String str){
        ArrayList<String> a = new ArrayList<String>();
        
        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========POWER SET PROBLEM==========\n");
        /* This problem print the power set of the characters in a string */

        System.out.println("Provide a String : ");
        String str = input.nextLine();

        System.out.println(generatePowerSet(str));

        input.close();
    }
}
