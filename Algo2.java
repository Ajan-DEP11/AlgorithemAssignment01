

public class Algo2 {

    
    public static void main(String[] args) {

        int large;
        int small;
        int i;
        
        int num[] = new int[]{-5, 2, 7, 10, 58, -7, 8, 23};
        int n = num.length;
        large=small=num[0];
        for(i=1;i<n;++i){
        
        if(num[i]>large)
        large=num[i];

        if(num[i]<small)
        small=num[i];
        }

        System.out.println("Smallest num: " +small);
        System.out.println("Largest num: " +large);

        
    }
}
