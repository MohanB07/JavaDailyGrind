import java.util.Scanner;
public class Queue {
    static int size = -1;
    final static int limit = 5;
    static int[] arr = new int[limit];

    static int addFirst(int a){
        if(size == limit-1){
            System.out.println("Queue Overflow");
            return 0;
        }
        if(size == -1){
            size = size + 1;
            arr[size] = a;
        }
        else{
            size = size + 1;
            for(int i=size;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = a;
            System.out.println(a + " added in front");
        }

        return 0;
    }

    static int addLast(int a){
        if(size == limit-1){
            System.out.println("Queue Overflow");
            return 0;
        }
        size = size + 1;
        arr[size] = a;
        System.out.println(a + " added to last");

        return 0;
    }

    static int removeFirst(){
        if(size == -1){
            System.out.println("Queue Underflow");
            return 0;
        }
        int temp = arr[0];
        for(int i=1;i<=size;i++){
            arr[i-1] = arr[i];
        }
        size = size - 1;
        System.out.println(temp + " removed at first");

        return 0;
    }

    static int removeLast(){
        if(size == -1){
            System.out.println("Queue Underflow");
            return 0;
        }
        int temp = arr[size];
        size = size - 1;
        System.out.println(temp + " removed at Last");

        return 0;
    }
    static void peekFirst(){
        if(size == -1){
            System.out.println("No elements in queue to peek");
        }
        else{
            System.out.println(arr[0] + " element at First");
        }
    }

    static void peekLast(){
        if(size == -1){
            System.out.println("No elements in queue to peek");
        }
        else{
            System.out.println(arr[size] + " element at last");
        }
    }
    static int print(){
        if(size == -1){
            System.out.println("No elements in queue to print");
            return 0;
        }
        System.out.println("the elements in stack are :");
        for(int i=0;i<=size;i++){
            System.out.println(arr[i]);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t======QUEUE OPERATIONS======\n");
        int choice = 1;
        while(choice != 0){
            int temp = 0;
            System.out.println("1)push at First  \n2)push at Last \n3)remove at First \n4)remove at Last \n5)peek at First \n6)peek at Last \n7)print" );

            System.out.println("choose an option ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("provide element to add :");
                    temp = input.nextInt();
                    addFirst(temp);
                    break;
                case 2:
                    System.out.println("provide element to add :");
                    temp = input.nextInt();
                    addLast(temp);
                    break;
                case 3:
                    removeFirst();
                    break;
                case 4:
                    removeLast();
                    break;
                case 5:
                    peekFirst();
                    break;
                case 6:
                    peekLast();
                    break;
                case 7:
                    print();
                    break;
            
                default:
                    System.out.println("invalid input choice");
                    break;
            }

            System.out.println("1 = continue || 0 = exit ");
            choice = input.nextInt();

        }
        input.close();
    }
}
