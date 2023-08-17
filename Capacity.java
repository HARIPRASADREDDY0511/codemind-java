import java.util.*;
public class hr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s,t,b;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        int capacity,tc;
        capacity=2*s*t*b*512;
        tc=capacity/1024;
        System.out.printf("%d KB",tc);
    }
} 