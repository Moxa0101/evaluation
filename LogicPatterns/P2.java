import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n= ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for (int j=1; j <=i; j++) 
            {
                System.out.print(j);

            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.print(" ");
            
        }
        
        sc.close();
    }
}


