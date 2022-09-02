import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        compare(num1, num2, num3);
    }

    public static void compare(int num1, int num2, int num3) {


        if ((num1 > num2 && num1 > num3)) {
            System.out.println("a is largest number");
        } else if ((num2 > num3 && num2 > num1)) {
            System.out.println("b is largest number");
        } else if ((num3 > num1 && num3 > num2)) {
            System.out.println(("c is largest number"));
        }

    }
}
