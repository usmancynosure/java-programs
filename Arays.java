import java.util.*;
public class Arays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size= sc.nextInt();        
        // int[] marks=new int[3];
        // int marks[]= new int[3];
        // marks[0]= 94;
        // marks[1]=90;
        // marks[2]=88;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //arrays type 2
        // int marks[]={94,90,88};

        //input from user
        // int marks[]=new int[size];

        //for loop for input
        // for (int i=0; i<size; i++){
            // marks[i]=sc.nextInt();
        // }

        //for loop for output
        // for(int i=0; i<size; i++){
            // System.out.println(marks[i]);
        // }


        //question if x in numbers arrray print index number>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>...

        // int numbers[]= new int[size];
        // input
        // for(int i=0; i<size; i++){
        //    numbers[i]=sc.nextInt();
            // 
        // }
        // System.out.println("Enter x");
        // int x=sc.nextInt();

        // output
        // for (int i=0; i<numbers.length; i++){
            // if(numbers[i]==x){
                // System.out.println("x found at "+i);
                // this alogrithm is called linear search
            // }
        // }

        // ...........;...............................................
        //revers order

        // int[] marks= {99,44,66,77,44};
        // Arrays.sort(marks);
        // System.out.println(marks.length);
        // for (int i=marks.length-1; i>=0; i--){
            // System.out.println(marks[i]);
        // }


    String[] names= new String[size];

    //loop for input
    for(int i=0; i<names.length; i++){
        names[i]=sc.next();
    }

    //loop for output
    for(int i=0; i<names.length; i++){
        System.out.println(names[i]);
    }


    }
}
