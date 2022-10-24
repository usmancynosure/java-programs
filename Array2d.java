import java.util.*;
public class Array2d {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();

        int[][] numbers= new int[rows][col];

        //input
        //rowa
        for(int i=0; i<rows; i++){
            //coloums
            for(int j=0; j<col; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        // System.out.println("enter value of x");
        // int x= sc.nextInt();

        // output
        // for(int i=0; i<rows; i++){
            // for (int j=0; j<col; j++){
                // if(numbers[i][j]==x){
                    // System.out.println("number found at ("+i+","+j+")");
                // }

            // }
            // System.out.println();
            // 
        // }
        // 
        int min_row=0;
        int min_col=0;

        int max_row=numbers.length-1;
        int max_col=numbers.length-1;

        int Total_nun=rows*col;
        int count=0;


        //sprira 2d array;
        while(count<Total_nun){

            //left wall
            for(int i=min_row , j=min_col; i<=max_row && count<Total_nun ; i++){
                System.out.println(numbers[i][j]);
                count++;

            }
            min_col++;
            //bottom
            for(int i=min_row , j=min_col; j<=max_col && count<Total_nun; j++){
                System.out.println(numbers[i][j]);
                count++;
            }
            max_row--;
            //right
             
            for(int i=max_row , j=max_col; i>=min_row &&count<Total_nun; i--){
                System.out.println(numbers[i][j]);
                count++;
            }
            max_col--;
            //top
            for(int i=min_row , j=max_col; i>=min_col && count<Total_nun; j--){
                System.out.println(numbers[i][j]);
                count++;
            }
            min_row++;



        }


        
    }
}
