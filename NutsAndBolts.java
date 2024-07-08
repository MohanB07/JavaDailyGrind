import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NutsAndBolts {

    static void matchPairs(int siz, char[] nuts, char[] bolts){
        Character or[] =  { '!', '#', '$', '%', '&', '*' , '?', '@', '^' };
        ArrayList<Character> order = new ArrayList<Character>();
        ArrayList<Character> Nt = new ArrayList<Character>();
        ArrayList<Character> Bt = new ArrayList<Character>();

        Collections.addAll(order, or);
        
        for(char c : nuts){
            Nt.add(c);
        }
        for(char b : bolts){
            Bt.add(b);
        }
        int k = 0;
        for(int i=0;i<or.length;i++){
            if( Nt.contains(order.get(i)) && Bt.contains(order.get(i))){
                nuts[k] = order.get(i);
                bolts[k] = order.get(i);
                k = k + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========NUTS AND BOLTS PROBLEM==========\n");
        /* Given a set of n nuts & bolts. There is a one-on-one mapping between nuts and bolts.
        You have to Match nuts and bolts efficiently. The elements should follow the following order: { !,#,$,%,&,*,?,@,^ } */

        System.out.println("Enter the number of characters in Nuts and Bolts : ");
        int siz = input.nextInt();
        char nuts[] = new char[siz];
        char bolts[]  = new char[siz];

        System.out.println("Provide values for nuts : ");
        for(int i=0;i<siz;i++){
            nuts[i] = input.next().charAt(0);
        }
        input.nextLine();

        System.out.println("Provide values for bolts : ");
        for(int i=0;i<siz;i++){
            bolts[i] = input.next().charAt(0);
        }
        input.nextLine();

        matchPairs(siz, nuts, bolts);

        for(char c : nuts){
            System.out.print(c + " ");
        }

        System.out.println(" ");

        for(char d : bolts){
            System.out.print(d + " ");
        }

        input.close();
    }

}