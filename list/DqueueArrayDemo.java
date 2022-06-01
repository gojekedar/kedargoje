package list;
import java.util.*;
public class DqueueArrayDemo 
{
    public static void main(String[]kedar)
    {
        Deque<String> dq=new ArrayDeque <String>();
        dq.addLast("Last");
        dq.add("aaa");
        dq.add("bbb");
        dq.addFirst("First");
        dq.add("ccc");
        dq.add("ddd");
        dq.add("Current add");
        dq.offer("19");
        dq.offer("17");
        dq.offer("21");

        System.out.println(dq);
    }    
}
