import java.util.Scanner;

public class input_name {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int size = sc.nextInt();
        String arr []= new String[size];

         //inputs
        System.out.println("enter your string inputs : ");
        for (int i = 0;i<size;i++){
            arr[i]= sc.next();
        }
        //output
        System.out.println("your output is : ");
        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
