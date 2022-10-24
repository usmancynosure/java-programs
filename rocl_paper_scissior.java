import java.util.*; 

import java.util.random.*;;

public class rocl_paper_scissior {
    public static void main(String[] args){
        System.out.println("rock----(0) | paper----(1) |  scissor----(2)");
        Scanner sc=new Scanner(System.in);
        System.out.println("player turn");
        int player=sc.nextInt();
        Random d= new Random();
        int count;
        while true;
        int rand = d.nextInt(3);
        if (player==0 && rand==1){
            System.out.println("player win");
        }else if (rand==1 && player==0){
            System.out.println("Computer won");
        }else if (player==1 && rand==2){
            System.out.println("Computer won");
        }else if (player==2 && rand==1){
            System.out.println("player won");
        }else if (player==0 && rand==2){
            System.out.println("player won");
        }else if (player==2 && rand==0){
            System.out.println("computer won");
        }else if (player==0 && rand==0 || player==1 && rand==1 || player==2 && rand==2){
            System.out.println("match tie");
        }


            // System.out.println("choose player one rock(0),paper(1),scissor(2");
            // int player_one= sc.nextInt();
            // System.out.println("choose player two rock,paper,scissor");
            // int player_two= sc.nextrand();

            // 
               

            // }else if {
                // System.out.println("player_one win");
            // }


        

    }
}
