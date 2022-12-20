class Quick extends Sorter {


    public int  partition (int low, int high){ // 0 , 2
        
        
        int p=choosePivot(low, high);// pivot indeks
        
        swap(high, p);

        int pivotElement=A[high];
        int left=low; // 0 // indeks
        int right=high-1; // 2-1 =1  // indeks

        while(leq(left, right)){ // når det ikke er tilfelle altså left>right hopp over hele while loopen
            while (leq(left, right) && leq(A[left], pivotElement)){
                left=left+1;
            }
            while(geq(right, left) && geq(A[right], pivotElement)){
                right=right-1; // 1-1 =0 ... 0-1= -1
            }
            if (lt(left,right)){
                
                swap(left, right);
            } 
        }

        /*
        while(left<=right){ // når det ikke er tilfelle altså left>right hopp over hele while loopen
            while (left<=right && A[left]<=pivotElement){
                left=left+1;
            }
            while(right>=left && A[right]>=pivotElement){
                right=right-1; // 1-1 =0 ... 0-1= -1
            }
            if (left<right){
                
                swap(left, right);
            } 
        }
         */

       
        swap(left, high);
        
        return left;
        


    }


    @Override 
    void sort() { 
         // overload, her sender low=0, high=n-1, altså array.length-1
        quickSort(0,n-1); // vi kaller quicksort med parametre 0, n-1
    }



    void quickSort(int low, int high){ // apply quicksort with parameters
        if (low >= high) {//geq(low, high)){ // avslutt rekursjon
            
            return;
        }
        int p=partition(low, high); // Pivot element i riktig pos, med elementene som er mindre til venstre, og elementene som er større til høyre for den
        quickSort(low, p-1);
        quickSort(p+1, high);
    }

    public  int choosePivot(int low, int high){
        return (low+high)/2;
        
    }

   

   

    String algorithmName() {
        return "quick";
    }

   
}