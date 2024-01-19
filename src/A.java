public class A {
    private static A a;
    private A()
    {
        System.out.println("je suis A");
    }
    public static A getInstance()
    {
        if(a==null)
            a=new A();
        return a;
    }
}
