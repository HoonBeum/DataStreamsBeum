import java.util.*;
/**
 * Write a description of class LinkedListTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueTest
{
   public void makeLinked(){
       QueueTest queue = new QueueTest();
       queue.make();
    }
    public void make(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.addFirst("B");
        System.out.println(list+"           add[A],addFirst[B]");
        list.offerFirst("C");
        System.out.println(list+"           offerFirst[C]");
        list.addLast("D");
        System.out.println(list+"           addLast[D]");
        list.offer("E");
        System.out.println(list+"           offer[E]");
        list.offerLast("F");
        System.out.println(list+"           offerLast[F]");
        list.add(0,"H");
        System.out.println(list+"           add[0,H]");
        System.out.println("Ex = "+list.set(0,"I"));
        System.out.println(list+"           set[0,I]");
        System.out.println(list.getFirst()+"           getFirst");
        System.out.println(list.getLast()+"           getLast");
        System.out.println(list.get(4)+"           get[4]");
        System.out.println(list.remove()+"           remove");
        System.out.println(list);
        System.out.println(list.removeLast()+"           removeLast");
        System.out.println(list);
        System.out.println(list.remove(2)+"           remove[2]");
        System.out.println(list);
    }
}
