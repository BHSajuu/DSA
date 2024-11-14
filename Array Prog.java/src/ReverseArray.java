public class ReverseArray {
    public static void reverse(int a[]){
        int s =0; int e =a.length-1;
        while(e>s){
            int tem = a[s];
            a[s]=a[e];
            a[e]=tem;
            s++ ; e--;
        }
       // return 0;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
         reverse ( a ); 
        System.out.print("reverse array is = " );
         for(int i=0; i< a.length;i++){
            System.out.print(a[i] + " ");
         }
    }
}
