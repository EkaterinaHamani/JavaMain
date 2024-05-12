import java.util.Scanner;

public class Task2 {
    String a;
    String b;

    public static void main(String[] params){
        System.out.println("Введите значение a");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Введите значение b");
        String b = in.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        }
        else {
            System.out.println("Строки неидентичны");
        }
    }}
