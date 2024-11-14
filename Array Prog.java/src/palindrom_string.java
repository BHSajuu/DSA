public class palindrom_string {
    public static void palindrom(String nam){
        int i=0,j=nam.length()-1,counter=0;
        while(i<j){
            if(nam.charAt(i)!=nam.charAt(j)){
                counter++;
            }
            i++;j--;
        }
        if(counter == 0){
            System.out.println("it is palindrom string");
        }
        else{
            System.out.println("not a plaindrom ");
        }
    } 
    public static void main(String[] args) {
        String nam ="madam";
        palindrom(nam);
    }
}
