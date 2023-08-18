import java.util.*;
public class hr{
    public static void main(String args[]){
        int n,remainder,reversed=0,original;
        Scanner h=new Scanner(System.in);
        n=h.nextInt();
        original=n;
        while(n!=0){
            remainder=n%10;
            reversed=reversed * 10 + remainder;
            n/=10;
        }
        System.out.printf("%d",reversed);
    }
}