package Functions;

public class passing_Arguments {
    public static void main(String[] args) {
        int x = sum(35,50);
        System.out.print("Sum is : " + x);
    }

  static int sum(int a,int b){
        int ans = a + b ;
        return ans;
  }
}
