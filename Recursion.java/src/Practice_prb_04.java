public class Practice_prb_04 {
    public static void main(String[] args) {
     String str ="abcab";
     for(int start=0; start <str.length(); start++){
        for(int end =start; end <=str.length(); end ++){
             System.out.print(str.subSequence(start, end) + "  ");
             System.out.println();
      //   //  System.out.println("contigous substring are :: ");
      //     if(start == end){
      //       System.out.print(str.subSequence(start, end) + "  ");
      //       System.out.println();
      //     }
      //      if(str.charAt(start) == str.charAt(end)){
      //       System.out.print(str.subSequence(start, end) + "  ");
      //       System.out.println();
      //     }
      //   }
      //  // System.out.println();
     }
    }
  }
}