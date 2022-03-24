package Queue_algorithm;

public class Queue {
    int arr[] = new int[5];
    int rare,front,size;
    
    void addValue(int data){
        if(!isFull()){
            arr[rare] = data;
            rare = (rare+1)%5;
            size++;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    int deleteValue(){
      int data = arr[front];
      if(!isEmpty()){
         front = (front+1)%5;
         size--; 
      }
      else{
          System.out.println("Queue is empty");
      }
      return data;
    }
    void show(){
        System.out.print("Queue element: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[(front+i)%5]+" ");//becaue when we delete value then front shift 1
        }
        System.out.println("Size: "+size);
        System.out.println("");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//        }
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == 5;
    }
}
