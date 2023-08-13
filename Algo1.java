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
            continue;
        }
        int fib_num=2;
        int i =1;
        String output="0,1,";

        do{

        output += i ;
        output += "," ;
         int k =0 ;
         k =fib_num ;
         fib_num =fib_num + i ;
         i =k ;

         


        }while(true);
    }while(true);
        
    }
}