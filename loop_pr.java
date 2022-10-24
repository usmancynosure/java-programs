import java.util.*;
public class loop_pr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // int num;
        // i=0;
        // do{
            // System.out.println("enter your marks");
            // int marks= sc.nextInt();
            // if (marks>90){
                // System.out.println("Outstanding performance");
            // }else if (marks>70 && marks<=90){
                // System.out.println("exelent");

            // }else{
                // System.out.println("Need improvement");
            // }
            // System.out.println("enter number 1 or 0");
            // num= sc.nextInt();

        // }while(num==1);

        // prime number Check
        System.out.println("enter number ");
        int num= sc.nextInt();
        // boolean prime=true;
        for (int i=2; i<num; i++){
            if (num%i==0){
                // prime=false;
                System.out.println("Not a prime number");
                break;

            }else{
                System.out.println("prime number");
                break;
            }
            }

    }



}
    

