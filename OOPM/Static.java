package OOPM;

// we can only access static members  inside the static method
public class Static {
    class NonStatic{
        static int a = 3;

        void display(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Static outerobj = new Static();
        Static.NonStatic obj =outerobj.new NonStatic();
        obj.display();
    }
}
