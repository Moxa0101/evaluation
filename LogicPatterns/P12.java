import java.util.*;
public class P12{
    public static void main(String[] args) {
      //i=row,j=blamk space,k=column star+
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(int i =n; i>=1; i-- ){
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=i ; k++){
                    System.out.print("*");
                }
     System.out.println();
        }
    
    }
}

