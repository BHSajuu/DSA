
public class LastOccuerence {
    public static void main(String[] args) {
        int ar[]={8,3,6,5,9,10,2,5,6};
       System.out.println( lastoccurence(ar,5, (ar.length-1)));
    }
    public static int lastoccurence(int ar[],int k, int i){
        if(i==0){
            return -1;
        }
        if(ar[i] == k){
            return i;
        }
        return  lastoccurence(ar,k,i-1);
    }
}
