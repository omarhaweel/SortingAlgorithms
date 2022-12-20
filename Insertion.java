class Insertion extends Sorter {

// O(n2) 
    void sort() {
        // [3,4,0] n=3  -> 3,0,4 -> 0,3,4 
        for (int i=1;i<=n-1;i++){ // 2 ganger
            
            int j=i;
            
            //gt(j, 0); // for å begynne sammenligning for hver j =i;
            // legg inn i while loop // gt 
            while(gt(j, 0) && gt(A[j-1],A[j])){
                swap(j, j-1);
                
                j--;
                //gt(j-1  , j); // for å telle sammenligning for hver j-1>j;
                

            }


            /*gt(j, 0); // for å begynne sammenligning for hver j =i;
            // legg inn i while loop // gt 
            while(j>0 && A[j-1] >A[j]){
                swap(j, j-1);
                
                
                int tmp=A[j];
                A[j]=A[j-1];
                A[j-1]=tmp;
                
                j--;
                gt(j-1  , j); // for å telle sammenligning for hver j-1>j;
                
            } 
            */
            
        }
      

    }

  

  

    String algorithmName() {
        return "insertion";
    }


    
}
