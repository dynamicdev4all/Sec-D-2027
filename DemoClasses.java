public class DemoClasses {

    void printData() {
        System.out.println("this is the first outer class");
    }

    // this is the first type of jave inner class (Static)
    static public class DemoClasses2 {
        void printData() {
            System.out.println("this is the first inner class DemoClasses2");
        }
    }

    // this is the second type of inner class (non-static)
    public class DemoClasses3 {
        void printData() {
            System.out.println("this is the second inner class DemoClasses3");
        }
    }

    // this is the third type of inner class (class inside of a fn)
    void createClass() {
        class DemoClasses4 {
            void printData() {
                System.out.println("this is the third inner class DemoClasses4");
            }
        }

        new DemoClasses4().printData();
    }
}
