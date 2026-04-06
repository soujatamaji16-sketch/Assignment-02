import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && a <= c)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}