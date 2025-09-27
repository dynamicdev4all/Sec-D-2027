public class Temp {
    public static void main(String[] args) {
        DemoClasses d1 = new DemoClasses();
        d1.printData();

        DemoClasses.DemoClasses2 d2 = new DemoClasses.DemoClasses2();
        d2.printData();

        DemoClasses.DemoClasses3 d3 = d1.new DemoClasses3();
        d3.printData();

        d1.createClass();
    }
}
