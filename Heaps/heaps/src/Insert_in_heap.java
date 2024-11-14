import java.util.*;
public class Insert_in_heap {

    public static class heap{
          ArrayList<Integer>list = new ArrayList<>();  //  to implement heap 
          public void add(int data){

            list.add(data); //  add the element at the last idx of arraylist
            int x=list.size()-1;
            int parent = (x-1)/2;
            while(list.get(x)<list.get(parent)){   // T.C = O(logn) in worst case can travel all the level of the tree
                int tmp=list.get(x); // child ko tmp mai rak diya 
                list.set(x,list.get(parent));
                list.set(parent, tmp);
                x=parent;   // child ko prarent bana diya for updations
                parent =(x-1)/2; 
               // System.out.println(list.get(0));
            }
          }

          public int peek(){

            return list.get(0);
          }

          public int remove(){
            int data =list.get(0);
            //step1 
             int tmp = list.get(list.size()-1);
             list.set(list.size()-1, list.get(0));
             list.set(0, tmp);

             // step2
             list.remove(list.size()-1);

             // step3
             heapify(0);
             return data;
          }
         private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx =i;
            if(left<list.size() && list.get(minIdx)>list.get(left)){
                minIdx = left;
            }
            if(right<list.size() && list.get(minIdx)>list.get(right)){
                minIdx = right;
            }
            if(minIdx !=i){
                int tmp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, tmp);
                heapify(minIdx); // for rest
            }
         }
         public boolean isEmpty(){
            return list.size() ==0;
         }
    }
    public static void main(String[] args) {
       heap h =  new heap();
       h.add(4);
       h.add(9);
       h.add(2);
       h.add(1);
    
    while(!h.isEmpty()){
    System.out.println(h.peek());
    h.remove();
    }

}
}