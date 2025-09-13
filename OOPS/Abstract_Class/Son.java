package Abstract_Class;

public class Son extends Parent {
    @Override
    void career(String name){
        System.out.println(name + " loves Priyanka.");
    }
    
    @Override
    void normal() {
        super.normal();
    }
}
