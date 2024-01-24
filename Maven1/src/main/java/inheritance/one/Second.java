package inheritance.one;

public class Second {
    int b=10;
    public static void main(String args[])
    {
        Second s= new Second();
        Final f= new Final();
        System.out.println(" Heyy" +f.getPrice());
        System.out.println(" Heyy" + f.a);
        System.out.println(" Heyy" + s.b);

    }
}
