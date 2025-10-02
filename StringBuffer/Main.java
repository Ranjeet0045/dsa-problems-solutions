package StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello Duniyaa");


        // sb.replace(3,6,"Rajo");
        // System.out.println(sb.capacity());;

        // sb.ensureCapacity(0);

        System.out.println(sb.substring(6, 11));;

        String str = sb.toString();
        System.out.println(str);
    }
}
