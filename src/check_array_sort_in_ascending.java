import java.util.Scanner;

public class check_array_sort_in_ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //input
        System.out.println("enter the value for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //for ascending

        boolean ascending = true;

        //output
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {//condition for descending order
                ascending = false;
            }
        }
            if (ascending) {
                System.out.println("The array is in ascending order ");
            } else {
                System.out.println("The array is not in ascending order");
            }
        }
    }


