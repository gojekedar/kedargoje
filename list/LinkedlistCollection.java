package list;
import java.util.*;
public class LinkedlistCollection 
{
    public static void main(String[]args)
    {
        LinkedList<String> l3=new LinkedList<>();
        l3.add("Amol");
        l3.add("Raj");
        l3.add("Kedar");
        l3.add("Raju");
        l3.add("Aniket");
        

        Iterator itr=l3.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
