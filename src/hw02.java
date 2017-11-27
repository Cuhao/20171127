import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l1 =scn.nextInt();
        int m1 =scn.nextInt();
        int l2 =scn.nextInt();
        int m2 =scn.nextInt();
        int total = 60*(l2-l1)+m2-m1;
        int v1 = total/30,sum=0;
        if (v1>4){
            sum=sum+60*(v1-4)+280;
        }else {
            if (v1>2){
                sum=sum+(v1/30-2)*40+120;
            }else {
                sum=sum+(v1/30)*30;
            }
        }
        System.out.println(sum);

    }
}
