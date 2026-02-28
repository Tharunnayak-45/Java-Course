import java.util.*;
class Numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(n1+" ");
                n1++;
                
            }
            System.out.println();
            sc.close();
            
        }
    }
}
