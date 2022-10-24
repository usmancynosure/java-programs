// print pattern square
public class pattern {
    public static void main(String[] args){
        int n=4;
        int m=5;
        int num=1;
        // for (int i=1; i<=4; i++){
            // for (int j=1; j<=5; j++){
                // System.out.print("*");

            // }
            // System.out.println();
        // }

    // __________________________________
    // print pattern of sqaure but mission from centre matrix
    // for (int i=1; i<=n; i++){
        // for (int j=1; j<=m; j++ ){
            // if (i==1 || j==1 || i==n || j==m){
                // System.out.print("*");
            // }else{
                // System.out.print(" ");
            // }
        // }
        // System.out.println();
        // __________________________________

        // print pyramid

        // for (int i=1; i<=n; i++){
            // for (int j=1; j<=i; j++ ){
                // System.out.print("*");
            // }
            // System.out.println();

            // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            // output     *
                    //   **
                    //  *** 
                    // outer loop
            // for (int i=1; i<=n; i++){
                // space for loop
                // for (int j=1; j<=n-i; j++){
                    // System.out.print(" ");
                // 
                // }
                // for (int j=1; j<=i; j++ ){
                    // System.out.print("*");
            // }
            // System.out.println();
    // }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // ouput 1
        //   1 2
        //   1 2 3
        //   1 2 3 4

        // for (int i=1; i<=n; i++){
            // for (int j=1; j<=i; j++){
                // System.out.print(j+" ");
            // }
            // System.out.println();
        // }


        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // output 1 2 3 4 
            //    1 2 3
            //    1 2
            //    1
    
        // for (int i=n; i>=1; i--){
            // for (int j=1; j<=i; j++ ){
                // System.out.print(j+" ");

        // }
        // System.out.println();
    // }

    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // output 1 
        //    2 3
        //    4 5 6
        // for (int i=1; i<=n; i++){
            // for (int j=1; j<=i; j++ ){
                // System.out.print(num+" ");
                // num++;
        // }
        // System.out.println();
        // }


        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // output triangle
        // inner loop
        // for (int i=1; i<=n; i++){
            // loop for space
            // for (int j=1; j<=n-i; j++){
                // System.out.print(" ");

            // }
            // for (int j=1; j<=i; j++){
                // System.out.print("*"+" ");
            // }

            
            // System.out.println();
            
        // }
        // for (int i=n; i>=1; i--){
            // for (int j=1; j<=n-i; j++){
                // System.out.print(" ");
            // }
            // for (int j=1; j<=i; j++){
                // System.out.print("*"+" ");
            // }
            // System.out.println();
        // }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // home task
        // output        *****
                    //  *****
                    // ***** 
        // for (int i=1; i<=n; i++){
            // for (int j=1; j<=n-i; j++){
                // System.out.print(" ");
                // 
            // }
            // for (int j=1; j<=n; j++){
                // System.out.print("*");
            // }
            // System.out.println();

        // }
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // output    1
                //  2 2
                // 3 3 3
            //    4 4 4 4  
        // for (int i=1; i<=n; i++){
            // #for spaces
            // for (int j=1; j<=n-i; j++ ){
                // System.out.print(" ");
            // }
            // for (int j=1; j<=i; j++){
                // System.out.print(i+" ");

            // }
            // System.out.println();
        // }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // question no#10 butter fly
        // for (int i=1; i<=n; i++){
            // for (int j=1; j<=i; j++){
                // System.out.print("*");
            // }
            // for spaces
            // for (int j=1; j<=2*(n-i); j++){
                // System.out.print(" ");
            // }
            // for (int k=1; k<=i; k++){
                // System.out.print("*");

            // }
            // System.out.println();
        // }
        // for (int i=n; i>=1; i--){
            // for (int j=1; j<=i; j++){
                // System.out.print("*");
            // }
            // for spaces
            // for (int j=1; j<=2*(n-i); j++){
                // System.out.print(" ");
            // }
            // for (int k=1; k<=i; k++){
                // System.out.print("*");
            // }
            // System.out.println();
        // }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // print palindrom pyramid
        // for (int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++ ){
        //         System.out.print(" ");
        //     }
        //     for (int j=i; j>=1; j--){
        //         System.err.print(j);
        //     }
        //     for (int j=1; j<=i; j++){
        //         System.out.print(j);

        //     }
        //     System.out.println();

        // }

        // home task
        // OUTPUT 1111
            //    222
            //    33
            //    4

            // for(int i=1; i<=n; i++){
                // for (int j=n; j>=i; j--){
                    // System.out.print(i);
                // }
                // System.out.println();
            // }

            // >>>>>>>>>>>>>>>>>>>>>>>>>>>
            // output     1
                    //   1 2
                    //  1 2 3 
        // for(int i=1; i<=n; i++){
            // for (int j=1; j<=n-i; j++){
                // System.out.print(" ");
            // }
            // for (int j=1; j<=i; j++){
                // System.out.print(i);
            // }
            // for (int j=1; j<=i; j++){
                // System.out.print(j);
            // }
            // System.out.println();
        // }

        for (int i=1; i<=n; i++){
            
            for(int j=1; j<=n; j++){
                if (j==1 || i==j){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }

            }
            // for (int j=1; j<=2*(n-i); j++){
                // System.out.print(" ");
            // }
            for(int j=n; j>=1; j--){
                if (  j==n || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }

    
}
