public class sorted_and_rotated_array {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=3;  
        int idx = search(arr,tar,0,arr.length-1);
        System.out.println(idx);
      }
      public static int search(int arr[],int tar,int si,int ei){
            // base case   
            if(si>ei)
              return -1;
            // kaam
            int mid= si+ (ei-si)/2;
            // case found
            if(arr[mid]==tar)
               return mid;
          // mid on line 1
           else if(arr[si]<=mid){
              //  case a : left
                if(arr[si]<= tar && tar<= arr[mid-1])
                    return search(arr, tar, si, mid-1);
                // case b: right
                else
                  return search(arr, tar, mid+1, ei);
           }
           // mid on line 2
           else{
              // case c: riht
              if(arr[mid+1]<= tar && tar<=arr[ei])
                 return search(arr, tar,mid+1, ei);
                 /// case d : left
              else
                 return search(arr, tar, si, mid-1);
           }
      }
  }

