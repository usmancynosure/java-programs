import java.util.*;
public class if_else_pr {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your income");
        int income=sc.nextInt();
        int tax =0;
        if (income<=50000){
             tax=0;
            System.out.println(tax);

        }
         if (income>50000 && income<=100000){
            int tax1 =5/100*income;
            // System.out.println(tax1);
        }
         if (income>100000 && income<=300000){
            int tax2= tax1 + (income-100000) + (10/100*income)
        }
    }
}
