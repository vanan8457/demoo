package Strategy;

/**
 * main function is to run those behaviors
 */
public class main {
    public static void main(String[] args) {
        Context context =new Context(new OperationAdd());
        System.out.println("10+5=" + context.excuteStrategy(10,5));
        context =new Context(new OperationSubstract());
        System.out.println("10-5=" + context.excuteStrategy(10,5));
        context =new Context(new OperationMultiply());
        System.out.println("10*5=" + context.excuteStrategy(10,5));


    }
}
