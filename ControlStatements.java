import java.util.*;
class ControlStatements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("number is positive:"+n);
        }
        else if(n<0){
            System.out.println("number is negative:"+n);
        }
        else{
            System.out.println("number is zero"+n);
        }
    }
}