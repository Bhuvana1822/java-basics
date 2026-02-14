import java.util.*;
class GreatestOfThree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        System.out.println("Enter c value:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is big:"+a);
        }
        else if(b>c && b>a){
            System.out.println("b is big:"+b);
        }
        else{
            System.out.println("c is big:"+c);
        }
    }
}