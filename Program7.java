//WAP to swap 2 numbers using a third variable
import java.util.*;
class Program7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        System.out.println("Before swapping a = "+a+" b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = "+a+" b = "+b);
    }
}