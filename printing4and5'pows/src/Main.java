import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++){if (i % 4 == 0){System.out.println(i);}if (i % 5 == 0){System.out.println(i);}}}}
