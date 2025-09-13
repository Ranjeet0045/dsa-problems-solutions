package Stack.Basics;

public class DynamicStack extends CustomStack {

    //  Extends keyword inherits all the properties of previous parent class

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){

        if(this.isFull()){
            //double the array size
            System.out.println("Size is doubled...");
            int[] temp = new int[data.length*2];

            //copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(item);
    }

    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack(5);

        stack.push(45);
        stack.push(32);
        stack.push(85);
        stack.push(25);
        stack.push(16);
        stack.push(85);
        stack.push(78);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
