package OOPM;

//the static block executes only once- when the class is loaded
public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("Inside static block 1");
        b = a * 2;
        System.out.println(b);
    }

    static {
        System.out.println("Inside static block 2");
        b = b+5;
        System.out.println(b);
    }

    //non static
    {
        System.out.println("Non static block");
    }

    StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");


    }
}

//before main() starts, the class gets loaded
//then main executes