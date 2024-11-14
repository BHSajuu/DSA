public class Q_using_Array {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }  

        // isEmpty()
        public static boolean  isEmpty(){
            return rear==-1;
        }
        
        // Add
        public  void Add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        //remove  T.C=O(n)
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
            
        }

        // Peek 
        public  int  Peek(){
            if(isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }
            return arr[0];
        }
        public  void print(){
            while(!isEmpty()){
                System.out.print(Peek()+"  ");
                remove();
            }
        }
  }
  public static void main(String[] args) {
    Queue q =new Queue(5);
    q.Add(1);
    q.Add(2);
    q.Add(3);
    q.print();
    }
}
