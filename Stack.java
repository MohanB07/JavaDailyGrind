import java.util.Scanner;
public class Stack {
    static int size = -1;
    final static int limit = 5;
    static int arr[] = new int[limit];

    static int push(int a){
        if(size == limit-1){
            System.out.println("Stack Overflow");
            return 0;
        }
        size = size + 1;
        arr[size] = a;
        System.out.println(a + " added to stack " + (arr.length));
        return 0;
    }

    static int pop(){
        if(size == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = arr[size];
        size = size - 1;
        System.out.println(temp + " removed from stack");

        return 0;
    }

    static void peek(){
        if(size == -1){
            System.out.println("No elements available in Stack.");
        }
        else{
            System.out.println("item at the end of stack is " + arr[size]);
        }
    }

    static void print(){
        System.out.println("the elements in stack are :");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t======STACK OPERATIONS======\n");

        int choice = 1;
        while( choice != 0){
            System.out.println("1) push \n2) pop \n3) peek \n4)print");

            System.out.println("\nChoose the operation");
            int option = input.nextInt();


            switch (option) {
                case 1:
                    System.out.println("enter the value to insert : ");
                    int temp = input.nextInt();
                    push(temp);
                    break;
                
                case 2:
                    pop();
                    break;
                
                case 3:
                    peek();
                    break;

                case 4:
                    print();
                    break;
                
                default:
                    System.out.println("your option is invalid");
                    break;
            }

            System.out.println("1 = continue || 0 = exit");
            choice  = input.nextInt();
        }

        input.close();
    }
}
