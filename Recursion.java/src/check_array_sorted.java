public class check_array_sorted {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(sorted(a,0));
    }
    public static boolean sorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return  sorted(a, i+1);
    }
}
