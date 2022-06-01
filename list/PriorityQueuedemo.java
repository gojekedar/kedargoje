package list;

import java.util.*;

public class PriorityQueuedemo 
{
    public static void main(String[]kedar)
    {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("CAPGEMINI");
        pq.add("TCS");
        pq.add("WIPRO");
        pq.add("BATA");
        pq.add("TATA");
        
        System.out.println("Head : "+pq.element());
        System.out.println("Head : "+pq.peek());
        System.out.println("Iteratting Queue elements. ");

        Iterator itr=pq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        pq.remove();
        pq.poll();
        System.out.println("After removing two element.");

        Iterator <String> itr2=pq.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }   
}
