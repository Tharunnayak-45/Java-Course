import java.util.*;
class Leapyear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.print(year + "is a Leapyear");
        }else{
            System.out.print(year + "is a not Leapyear");
        }
        sc.close();
    }
}
