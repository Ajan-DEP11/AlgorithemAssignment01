import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scaanner = new Scanner(System.in);
    public static void main(String[] args) {

        String text;

        do{

        System.out.println("Enter the text: ");
        text = scaanner.nextLine().strip();

        if(text.isBlank()){
            continue; }

        char[] chars =text.toCharArray() ;

        int j=chars.length-1 ;

        int p =0;
        if(chars.length%2==0){
           p=1 ; }

        for (int i=0;i<chars.length/2-p; i++){
             
            char k;
            k =chars[i] ;
            chars[i] = chars[j] ;
            chars[j]=k ;
            j--;
        }

        String revString = new String(chars);
        System.out.println(revString);
    }while(true);


        
    }
}
