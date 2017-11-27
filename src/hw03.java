import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int l1 = scn.nextInt();
        int m1 = scn.nextInt();
        int l2 = scn.nextInt();
        int m2 = scn.nextInt();
        int total = 60 * (l2 - l1  ) + m2 - m1;
        int v1 = total / 30, sum = 0;
        if (v1 > 4) {
            sum=120;
            v1=v1-4;
        }else {
            sum=v1*30;
            v1=0;
        }if (v1>4){
            sum=sum+160;
            v1=v1-4;
        }else {
            sum=sum+v1*40;
            v1=0;
        }
        if (v1>0){
            sum=sum+v1*60;
        }
        System.out.println(sum);
    }
}
