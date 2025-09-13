package Functions;

import java.util.Arrays;

public class Variable_Arguments {
            public static void main(String[] args) {
                fun(1,2,4,5,7,5,6,9);
            }

            static void fun(int ...v){
                System.out.print(Arrays.toString(v));
            }
}
