package list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistCollection 
{
    public static void main(String[]args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Amol");
        list.add("Aniket");
        list.add("Raj");
        list.add("Kedar");
        list.add("Raju");

        Iterator itr=list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }  
}
