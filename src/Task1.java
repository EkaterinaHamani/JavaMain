import java.util.Scanner;

public class Task1 {
    int a;
    int b;

    public static void main(String[] params){
        System.out.println("Введите значение a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        if (a == b)  {
            System.out.println("a == b");
        }
        if (a > b) {
            System.out.println("a > b");
        }
        if (a < b) {
            System.out.println("a < b");}

        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a * b;
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a / b = " + e);
        System.out.println("a * b = " + f);

    }}