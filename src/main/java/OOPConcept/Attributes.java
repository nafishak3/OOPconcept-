package OOPConcept;

public class Attributes {
    private String myName = "Sakif"; //Global variable

    //public can be access under whole project
    //private is only for that particular class
    //protected is for current package

    public static void main(String[] args) {

        String yourName = "Polin"; //local variable for main method
        String name2 = "ish";

        Attributes obj = new Attributes();
        System.out.println(obj.myName);
        System.out.println(yourName);
        obj.myName();
    }

    public void myName() {
        String nickName = "Shad"; //local variable for myName method
        System.out.println(nickName);
        System.out.println(myName);
    }


    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}


