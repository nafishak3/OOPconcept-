package OOPConcept;

public class MethodPractice {
    public static void main(String[] args) {
        test02();
        test03();

       // System.out.println(test02());

        System.out.println("______");

        MethodPractice m = new MethodPractice();
        m.test01();

        System.out.println("______");

        int n = m.test1();
        System.out.println(n);

        System.out.println("______");

        int x = m.test1(20, 20);
        System.out.println(x);

        System.out.println("______");

        Object y =m.test1(23, "Nafisha ");
        System.out.println(y);

        System.out.println("______");
        Object q = m.test1("Life- IS ", "Boring.");
        System.out.println(q);

        System.out.println("______");
        System.out.println("______");
        System.out.println("______");
        System.out.println("______");



        AttributesPractice a1 = new AttributesPractice();
        String name = a1.getMyname();
        System.out.println(name);
        a1.setMyname("POL");
        name = a1.getMyname();
        System.out.println(name);

    }
    public static String test02(){     // static doens't need object and no parameter
        String s = "Nafisha";
        return s;
    }
    public static int test03(){     // static doens't need object and no parameter
        int i = 40;
        return i;
    }

    public void test01(){              // void type Method/ no return ..  no parameter
        int i = 200;
        System.out.println(i);
    }
    public int test1(){                 // int type Method, no parameter
        int n = 150;
        return n;
    }
    public int test1(int n, int m) {    // int type Method, 2 parameters
        return m + n;
    }
    public Object test1(int n, String m) {   // obejct type Method .. 2 parameters with int and stirng variable
        return m + n;
    }
    public Object test1(String n, String k) {   // object type Method..  2 parameter with String variable
        return n + k;
    }


}


