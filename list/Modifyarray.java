package list;
import java.util.*;
public class Modifyarray 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        ArrayList<Integer> lis=new ArrayList<>();
        System.out.println("Enter the Elements in array : ");
        for(int i=0;i<n;i++)
        {
            int input=sc.nextInt();
            lis.add(input);
        }
        System.out.println(lis);
        // remove element from index
        System.out.print("Enter the Index location to remove element in array : ");
        int ind=sc.nextInt();
        lis.remove(ind);
        System.out.println(lis);
    }
}
