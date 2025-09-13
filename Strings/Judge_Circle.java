public class Judge_Circle {

    static boolean judgeCircle(String moves){
    boolean ans = false;
      int Lmove=0,Rmove=0,Umove=0,Dmove=0;
      for(int i=0; i<moves.length(); i++){
        switch (moves.charAt(i)) {
            case 'L' -> Lmove++;
            case 'R' -> Rmove++;
            case 'U' -> Umove++;
            default -> Dmove++;
        }
      }
      if(Umove == Dmove && Lmove == Rmove){
        ans = true;
      }
      return ans;
    }

    public static void main(String[] args) {
        String moves = "LL";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }
}
