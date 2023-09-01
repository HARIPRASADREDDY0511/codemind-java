import java.util.Scanner;
public class Hari{
    public static void main(String args[]){
        Scanner hr=new Scanner(System.in);
        int a=hr.nextInt();
        int b=(a*(a-1))/2;
        System.out.print(b);
    }
}