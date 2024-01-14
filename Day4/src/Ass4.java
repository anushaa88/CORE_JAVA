public class Ass4 {

    private static int staticVariable = 10;


    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {

        System.out.println("Static Variable: " + Ass4.staticVariable);

        int result = Ass4.getStaticVariable();
        System.out.println("Result from static method: " + result);
    }
}
