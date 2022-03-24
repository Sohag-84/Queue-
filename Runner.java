package Queue_algorithm;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        
        q.addValue(21);
        q.addValue(5);
        q.addValue(2);
        q.addValue(6);
        
        q.deleteValue();
        q.deleteValue();
        
        q.show();
        //System.out.println(q.isFull());
       
    }
}
