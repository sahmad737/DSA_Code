import java.util.*; 
  
public class QueueS { 
  
    public static void main(String args[]) 
    { 
        Queue<String> pq = new PriorityQueue<>(); 
  
        pq.add("Shaurya"); 
        pq.add("Mehul"); 
        pq.add("Sameer"); 
  
        System.out.println("Initial Queue " + pq); 
  
        pq.remove("Geeks"); 
  
        System.out.println("After Remove " + pq); 
  
        System.out.println("Poll Method " + pq.poll()); 
  
        System.out.println("Final Queue " + pq); 
    } 
} 
