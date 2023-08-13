import java.util.Scanner;

public class Algo3 {
    private static final Scanner scaanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50}; 

        int[] reverseNums =new int[nums.length];

        int x =0;
        for (int i=nums.length-1;i>-1;i--){
        
             reverseNums[x] =nums[i];
             x++ ;
        }

        nums =reverseNums ;

         for (int i=0;i<nums.length;i++)
        {
            System.out.printf("%d, ",nums[i]);
          
        }  
        System.out.println();
        
    }
}

