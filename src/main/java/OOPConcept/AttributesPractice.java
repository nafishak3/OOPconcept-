package OOPConcept;

public class AttributesPractice {
     private String myname = "Polin";        // Global variable // Encapsulation is private

    public static void main(String[] args) {
        String y = "KKKKKKK";                // Local varibale
        System.out.println(y);

        System.out.println("______");

        AttributesPractice a = new AttributesPractice();
       a.getMyname();
        System.out.println(a.getMyname());

        System.out.println("______");

        System.out.println(a.getMyname());

    }

    public String getMyname(){             //  Local varibale
        return myname = myname;
    }

    public void setMyname(String myname) {
        this.myname =myname;
    }
}
