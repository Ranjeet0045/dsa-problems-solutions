public class Pallindrome {
    public static void main(String[] args) {
        String name = "abcdcba";
        String reverse = new StringBuilder(name).reverse().toString();
        if(name.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
