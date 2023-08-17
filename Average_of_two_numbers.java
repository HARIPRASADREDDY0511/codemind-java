import java.util.*;
public class hr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=(float)(a+b)/2;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}