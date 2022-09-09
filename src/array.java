import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        sumArray();
        sumArray();
    }

    public static void sumArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Please enter 5 numbers:");
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum is: " + sum);

        System.out.println("The average is: " + sum / arr.length);
    }
}