package OOPConcept;

public class Methods {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);


        Methods obj = new Methods();

        obj.test();

        int num = obj.test02(10);
        System.out.println("test02: " + num);
        //System.out.println(obj.test02());

        Object myAge = obj.test02("My age is " + 22);
        System.out.println(myAge);

        System.out.println(test05());

        Attributes obj2 = new Attributes();
        String name = obj2.getMyName();
        System.out.println(name);
        obj2.setMyName("Shadman");
        name = obj2.getMyName();
        System.out.println(name);

    }

    //void method
    public void test() {
        int i = 10;
        System.out.println("test01: " + i);
    }

    //no input(parameter) but some return
    public static int test05() { //method overloading no one parameter
        int i = 60;
        return i;
    }

    //input also return
    public int test02(int i) { //method overloading with one integer parameter
        return i;
    }

    public Object test02(int i, String str) { //method overloading with one integer parameter
        return str + i;
    }

    public int test02(int i, int j) { //method overloading with two integer parameter
        return i + j;
    }

    public String test02(String str) { //method overloading with one String parameter
        return str;
    }
}
