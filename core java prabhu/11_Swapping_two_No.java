import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
      
       a = a*b;
       b = a/b;
       a = a/b;
       System.out.println("a : "+a+" b: "+b);
    }
}