package prgmod;

/**
 * Exemples d'àmbits de variables
 * @author Jose
 */
public class Ambits {

    /**
     * scope: the whole class
     * visibility = scope except when being hidden by another variable with the same name and local scope 
     * extension (non-static): since object instantiation until destruction.
     * extension (static): the whole program execution.
    */
    private static String msg = "Class attribute"; //scope the whole class
    
    public static void main(String[] args) {
        /**
         * scope: since declaration to end of block
         * visibility = scope except when being hidden by another variable with the same name and local scope 
         * extension: since start of function execution until return
        */
        String msg = "Local in main"; //scope: main function. Hides visibility of msg class attribute.
        System.out.println("* f1(\"Function argument\")");
        f1("Function argument");
        System.out.println("* f1(msg)");
        f1(msg);
        System.out.println("* f2()");
        f2();
        System.out.println("* f3()");
        f3();
        System.out.println("* f4(msg)");
        f4(msg);
        System.out.println("* main:println(msg)");
        System.out.println(msg);
        System.out.println("* Ambits.msg");
        System.out.println(Ambits.msg);
    }
    
    public static void f1(String msg) {
        //msg parameter has local scope and hides visibility of msg class attribute in function
        System.out.println(msg);
    }
    
    public static void f2() {
        /**
         * scope: since declaration to end of block
         * visibility = scope except when being hidden by another variable with the same name and local scope 
         * extension: since start of function execution until return
        */
        String msg = "Local variable";
        //msg local variable has local scope and hides visibility of msg class attribute in function
        System.out.println(msg);
    }
    
    public static void f3() {
        //msg class attribute keeps visibility in function
        System.out.println(msg);
    }
    
    public static void f4(String msg) {
        msg = "Function parameter changed";
        System.out.println(msg);
    }
}
