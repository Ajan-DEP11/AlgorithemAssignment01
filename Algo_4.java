public class Algo_4 {
    public static void main(String[] args) {
        
        int[] nums = {10, 20, 30, 40, 50}; 

        int x= nums.length-1 ;
        int y =0;

        if(nums.length%2==0){
           y=1 ;}

        for (int i=0;i<nums.length/2 -y; i++){
             
            int k=0;

                  k = nums[i] ;
            nums[i] = nums[x] ;
            nums[x] = k ;
            x--;
         }

        for (int i=0;i<nums.length;i++)
        {
            System.out.printf("%d ",nums[i]);
        }
        System.out.println();
    }
}
