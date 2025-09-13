package Functions;

public class Swapping {

    //In Java only pass by value Exist 
    //Not any pass by reference Exist
    
    static void swap(int a,int b){
        a = 20;
        b = 30;
        int temp = a;
        a = b;
        b = temp;
        //Here Swapping will be done
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        swap(a,b);
        //Swapping will not be done
        System.out.println(a + " " + b);
    }

    

   
}


