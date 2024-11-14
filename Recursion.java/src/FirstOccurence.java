public class FirstOccurence {
    public static void main(String[] args) {
        int ar[]={8,3,6,5,9,10,2,5,6};
       System.out.println( firstoccurence(ar,1,0));
    }
    public static int firstoccurence(int ar[],int k,int i) {
        if(i== ar.length-1){
            return -1;
        }
        if(ar[i]== k){
            return i;
        }
        return firstoccurence(ar,k,i+1);
    }
}
