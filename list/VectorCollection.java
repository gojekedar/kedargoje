package list;
import java.util.*;
public class VectorCollection 
{
    public static void main(String[]args)
    {
        Vector<String> vr=new Vector<>();
        vr.add("Mumbai");
        vr.add("Goa");
        vr.add("pune");
        vr.add("chennai");

        

        Iterator itr=vr.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
