import java.util.Scanner;

public class hw04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1=0,v2=0,v3=0,count=0;
        int n=scn.nextInt();
        for (int i=0;i<1;i++){
            v1=scn.nextInt();if (v1<60){count++;}
            v2=scn.nextInt();if (v1<60){count++;}
            v3=scn.nextInt();if (v1<60){count++;}
            if ((v1+v2+v3)>220){
                if (Math.min(Math.min(v1,v2),v3)<60){
                    System.out.println("M");
                }else {
                    System.out.println("P");
                }
            }else {
                if (count==2){
                    if (Math.max(Math.max(v1,v2),v3)>=80){
                        System.out.println("M");
                    }else {
                        System.out.println("F");
                    }
                }
            }
        }
    }
}