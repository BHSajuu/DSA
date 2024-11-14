public class printing_character_from_string {
    public static void printlettering(String nam){
            for(int i=0 ; i<nam.length();i++){
                System.out.print(nam.charAt(i)+" ");
            }
    }
    public static void main(String[] args) {
        String nam ="SHAHIDA";
        printlettering(nam);
    }
}
