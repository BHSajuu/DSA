public class Circular_Q_using_Array {
    public static class Queue{
      static  int arr[];
      static int size;
      static  int front;
      static  int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
    
           // isEmpty()
           public static boolean  isEmpty(){
            return rear==-1 && front==-1;
        }
        // isful()
        public static boolean isFul(){
            return (rear+1)%size==front;
        }

        // add
        public void add(int data){
            if(front==0 && rear==size-1){
                System.out.println("Queue id full");
                return;
            }
            // add 1st element 
            if(front==-1)
               front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        // remove

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int f=arr[front];

            // delete last element 
            if(rear==front){
                rear=front=-1;
            }
            else 
              front=(front+1)%size;
            return f;
        }

        
        // Peek 
        public  int  Peek(){
            if(isEmpty()){
                System.out.println("queue is empty ");
                return -1;
            }
            return arr[front];
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
        q.add(1);
        q.add(2);
        q.add(3);
       System.out.print( q.remove()+" ");
        q.add(4);
      System.out.print( q.remove()+" ");
        q.add(5);
        q.print();
        }
    }
