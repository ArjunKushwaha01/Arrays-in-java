import java.util.Scanner;

public class found_num_printIts_index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        int arr [] = new int[size];

        //input
        System.out.println("enter the array inputs :");
        for (int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number you want to find in array");
        int x = sc.nextInt();

        //output
        System.out.println("your output is :");
        for (int i =1;i< arr.length;i++){
            if (arr[i]==x){
                System.out.println("x is found in index : " + i);
            }
        }

    }
}
