public class Power_of_two {
    public static void main(String[] args) {
        int n = 8;
        boolean ans;
        int bitmask = 1 << Integer.SIZE - Integer.numberOfLeadingZeros(n)-1;
        if(n == 0){
            ans = false;
        }
        else{
            ans = (n & bitmask) == n;
        }
        System.out.println(ans);
        
        // if(n == 0){
        //    ans = false; 
        // }
        // else{
        //     ans = (n & (n-1)) == 0;
        // } 
        // System.out.println(ans);

    }
}
