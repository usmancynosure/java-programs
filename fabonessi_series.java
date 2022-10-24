import java.util.*;
public class fabonessi_series {
    public static void fabonesiSeries(int n){
        int a=0;//1
        int b=1;//1
        int c;
    for (int i=1; i<=n; i++){
        if (i==1){
            System.out.println(a);
        }else if (i==2){
            System.out.println(b);
        }else if (i>2){
            c=a+b;
            a=b;
            b=c;
            System.out.println(b);
        }
    }
        }

    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        fabonesiSeries(n);

    }
    
}

