
public class Bubble extends Sorter {
        // O(n2) bubble sort
        // n =4
        //[3,0,4,1] -> [0,3,4,1] -> [0,3,1,4] // ->[0,1,3,4]
     void sort(){

        for (int i=0;i<=n-2;i++){
            for (int j=0;j<=n-i-2;j++){
                if (gt(A[j], A[j+1])){
                    swap(j, j+1);// increase swaps by one if condition satisfied
                }
            }
        }
        
     }

    
     
     String algorithmName(){
        return "Bubble";
     }

}
