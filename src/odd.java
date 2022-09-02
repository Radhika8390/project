import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an number:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");


    }
}