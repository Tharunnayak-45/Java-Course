import java.util.*;
class RightAligned {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=0;
        int star=n;
        for(int i=1;i<=n;i++){
        for(int j=1;j<=spaces;j++){
            System.out.print("\t");
        }
        for(int k=1;k<=star;k++){
            System.out.print("*\t");
        }
            spaces++;
            star--;
        System.out.println();
        sc.close();
        }
}
}
