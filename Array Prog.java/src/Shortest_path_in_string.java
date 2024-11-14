public class Shortest_path_in_string {
    public static void shortestpath(String s){
        int x=0,y=0;
        for(int i=0; i<s.length();i++ ){
            switch(s.charAt(i)){
                case 'N' : y++;
                           break;
                case 'S' : y--;
                           break;
                case 'W' : x--;
                           break;
                case 'E' : x++;
                           break;
                default : break; 
            }
        }System.out.println("shortest distance = " + Math.sqrt(x*x+y*y));

    }
    public static void main(String[] args) {
        String s ="WNEENESENNN";
        shortestpath(s);
    }
}
