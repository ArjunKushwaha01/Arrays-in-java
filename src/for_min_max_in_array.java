import java.util.Scanner;

public class for_min_max_in_array {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();
        int arr [] = new int[size];

        //input
        System.out.println("enter the array value : ");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        // for max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("the maximum value is : "+max);
        System.out.println("the minimum value is : "+min);
    }
}
