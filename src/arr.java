import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ar = new int[5];
        System.out.println("Enter number:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = in.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum = sum + ar[i];
        {
            System.out.println("The sum is:" + sum);
            System.out.println("The average is:" + sum / ar.length);
        }
    }
}