// O (n log(n))
public  class Merge extends Sorter {

    void sort(){
        sort(A);
    }

    int [] sort(int [] array){ // 

        if (array.length<=1){ // return an array that can not be divided more
            return array;       // when this condition is satisfied
        }

        int i=array.length/2; // del size i to


        int[] arr1=new int[i];
        int[] arr2=new int[array.length-i];

        for (int x=0;x<i;x++){ // adding elements from 0 to i-1 pos from arr to arr1
            arr1[x]=array[x];
        }
        int y=0;
        for (int z=i;z<=array.length-1;z++){ // adding elements from i to arr.size()-1 pos to arr2
            arr2[y]=array[z];
            y++;
        }


        int[] A1=sort(arr1);
        int[] A2=sort(arr2);

        return merge(A1,A2,array); // excute the merge algorithm on every set of argument
                                    // until we lastly get two sorted sub-arrays of the main initial array
    }


    public int [] merge(int[] A1,int[] A2,int[] array){
        // O(n)

        int i=0;
        int j=0;

        
        while (i<A1.length && j<A2.length){
            if (leq(A1[i], A2[j])){
                array[i+j]=A1[i];
                
                i=i+1;
            }else{
                array[i+j]=A2[j];
                j=j+1;
            }

        }
        while(i<A1.length){
            array[i+j]=A1[i];
            
            i=i+1;
        }
        while(j<A2.length){
            array[i+j]=A2[j];
            
            j=j+1;
        }

        return array;
    }







    String algorithmName() {
        return "Merge";
    }
}



