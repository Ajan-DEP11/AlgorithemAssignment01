import java.util.ArrayList;

public class Algo_8_2 {
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

    
    ArrayList<Integer> dynamicArray = new ArrayList<>();


    for(int i=0;i<numA.length; i++){
        if(!dynamicArray.contains(numA[i])){
           dynamicArray.add(numA[i]);
        }
    }
    for(int k=0;k <numB.length; k++){
        if(!dynamicArray.contains(numB[k])){
           dynamicArray.add(numB[k]);
        }
    }

    String output2 ="numA numB : {" ;
    for (int k=0;k<dynamicArray.size();k++){
       
         output2 += dynamicArray.get(k)+" " ;
    }
    output2 +="}";

    System.out.println(output2);
        
    }
}
