import java.util.Scanner;
public class FolderName {

    public void allocate(String[] folders){
        System.out.println("\nThe Folders after their unique names : ");
        for(int i=0;i<folders.length;i++){
            int count = 0;
            for(int j=i;j<folders.length;j++){
                if(folders[i].equals(folders[j])){
                    if(count > 0){
                        folders[j] = folders[j] + count;
                    }
                    count = count + 1;
                }
            }
        }
        for(int i=0;i<folders.length;i++){
            System.out.println(folders[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t==========FOLDER NAME ALLOCATION==========\n");

        /* n of folder names are to be given, if the folder already exists add 1 at atlast to its name and
        increment by 1 for every dulpicates to make it unique */

        System.out.println("Enter the number of folders to create : ");
        int n = input.nextInt();
        input.nextLine();

        String[] folders = new String[n];

        System.out.println("Provide the Folder names : ");
        for(int i=0;i<n;i++){
            folders[i] = input.nextLine();
        }

        FolderName fn = new FolderName();
        fn.allocate(folders);

        input.close();
    }
}
