import java.util.*;

public class Next_greater {
    public static void nextGreater(int a[],int nG[]){
        Stack<Integer> s=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[i]>=a[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                nG[i]=-1;
            }
            else{
                nG[i]=a[s.peek()];
            }
            s.push(i);

        }

    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int NextG[]=new int[arr.length];
        nextGreater(arr,NextG);
        for(int i=0;i<NextG.length;i++){
            System.out.print(NextG[i]+"  " );
        }
    }
}
