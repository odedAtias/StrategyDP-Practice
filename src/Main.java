//Strategy Pattern demo class
public class Main {
    //Main
    public static void main(String[]args){
        //Create new context object that change her behaviour when it changes its 'Strategy'
        Context context = new Context(new OperationAdd());
        System.out.println("5 + 2 = " + context.executeStrategy(5,2));
        //Switch the context behaviour to substraction
        context = new Context(new OperationSubstract());
        System.out.println("5 - 2 = " + context.executeStrategy(5,2));
        //Switch again the context behaviour to multiply
        context = new Context(new OperationMultiply());
        System.out.println("5 * 2 = " + context.executeStrategy(5,2));
    }
}
