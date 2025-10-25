package CollectionsFramwork;

public class WrapperClass {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        System.out.println(i);
        Integer s = Integer.valueOf("123");
        System.out.println(s);

        int obj1 = Integer.parseInt("12411");
        boolean b2 = Boolean.parseBoolean("true");

        Double d = 9.88;
        int i3 = d.intValue();
        System.out.println(i3);

        Integer k = 222;
        String s2 = k.toString();
        System.out.println(s2);

        //Why use Wrapper Classes?
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b);
    }
}
