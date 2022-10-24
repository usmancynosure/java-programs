import java.util.*;
public class Function_Factorial {
    //function to find factorial
    public static int findNumFactorial(int num){
        if (num<0){
            System.out.println("Invalid number and Ans is");
            return 0;
        }
        int n=1;
        for (int i=num; i>=1; i--){
            n=n*i;
        }
        return n;
    }



    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int n= findNumFactorial(num);
        System.out.println(n);

    }
}
