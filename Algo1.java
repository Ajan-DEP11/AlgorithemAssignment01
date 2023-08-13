import java.util.Scanner;

public class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num;

        do{

        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.nextLine();

        if(num>0){
            System.out.println("This is a positive number");
        }
    }while(true);
        
    }
}