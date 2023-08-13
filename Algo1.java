import java.util.Scanner;

public class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if(num>0){
            System.out.println("This is a positive number");
        }
        
    }
}