import java.util.Scanner;
public class VowelReverse {

    public void findVowels(String str){
        int size = str.length();
        char vowels[] = new char[size];
        int vowelsCount = 0;
        for(int i=0;i<str.length();i++){
            if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                vowels[vowelsCount] = str.charAt(i);
                vowelsCount = vowelsCount + 1;
            }
        }
        reverseTheVowels(str, vowels, vowelsCount-1);
    }
    
    static void reverseTheVowels(String str, char[] vowels, int vowelsCount){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
            str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                sb.setCharAt(i, vowels[vowelsCount]);
                vowelsCount--;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========VOWELS IN REVERSE==========\n");
        /* This problem finds the vowel char in a string and arrange the vowel char in reverse */

        System.out.println("Provide the String to print the vowels in reverse : ");
        String str = input.nextLine();

        VowelReverse vr = new VowelReverse();
        vr.findVowels(str);

        input.close();
    }
    
}
