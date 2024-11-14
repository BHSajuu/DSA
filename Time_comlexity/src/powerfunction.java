public class powerfunction {
    public static void main(String[] args) {
        int a=2,n=10;
        powerfun(a,n);
        System.out.println(powerfun(a,n));
    }
    public static int powerfun(int a,int n){
        if(n==0) return 1;
        int halfp=  powerfun(a,n/2);
        if(n%2!=0) return n*halfp*halfp;
        return halfp*halfp;
    }
}
