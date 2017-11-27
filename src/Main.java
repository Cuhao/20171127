import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x =scn.nextInt();
        int y =scn.nextInt();
        if ((x*x+y*y)<=10000){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
