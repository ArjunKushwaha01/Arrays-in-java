import java.util.Scanner;
public class user_I_P_array_with_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int num[] = new int[n];
        //input
        System.out.println("enter the inputs :");
        for (int i =0;i<n;i++){

            num[i]=sc.nextInt();
        }
        //output
        System.out.println("The output is :");
        for (int i = 0;i<n;i++){

            System.out.println(num[i]);
        }
    }
}
