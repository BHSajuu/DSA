public class Friends_pairing_probem {
    public static void main(String[] args) {
        System.out.println(Pairing_fuction(3));
    }
    public static int Pairing_fuction(int n){
        if(n==1 || n==2){
            return n;
        }
        return Pairing_fuction(n-1)+(n-1)*Pairing_fuction(n-2);
    }
}
