import java.util.Scanner;
import java.util.*;
public class commonDivisor {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();

        while(num1!=num2){
            if (num1>num2){
                num1=num1-num2;
            }else{
                num2=num2-num1;
            }
        }
        System.out.println(num2);


    }
}
