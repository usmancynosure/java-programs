public class sorting {
    //function
    static void printArray(int numbers[]){
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]+" ");

        }
        
        

    }
     public static void main(String[] args){
        int[] numbers= {7,8,3,1,2};
//bubble sort
// time complexity = 0(n^2)
        for (int i=0; i<numbers.length-1; i++){
            for (int j=0; j<numbers.length-1-i; j++){
                if (numbers[j]>numbers[j+1]){
                    //swap
                    int temp= numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;

        
                }
            }
            
        }
        printArray(numbers);
     }

}
