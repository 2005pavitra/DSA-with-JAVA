package OOPM;

public class AccessDemo {
    int instanceVar = 10; //non static var
    static int staticVar = 20; //static var

     class NonStatic{
        static int a = 4;

         void display(){
            System.out.println(a);
        }
    }


    //non static method
    void nonStaticMethod(){
        System.out.println("Static Var: "+ staticVar);
        System.out.println("Non Static Var: "+ instanceVar);
    }


    //static method
    static void StaticMethod(){
        System.out.println("Static Var: "+ staticVar);
//        System.out.println("Non Static Var: "+ instanceVar);
    }

    public static void main(String[] args) {
        AccessDemo outerobj = new AccessDemo();
        NonStatic obj = outerobj.new NonStatic();
        obj.display();

        StaticMethod();

        AccessDemo demo = new AccessDemo();
        demo.nonStaticMethod();

        System.out.println(AccessDemo.staticVar);
    }

}

