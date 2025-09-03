import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // System.setOut(new PrintStream("F:\\RDEC-JAVA-2027\\SEC-D\\temp.txt"));
        // System.out.println("Rakesh is From GZB");

        PrintStream out = new PrintStream("F:\\RDEC-JAVA-2027\\SEC-D\\temp.txt");
        out.println("This is without System Class");


        System.out.print("Rohit");
        System.out.print(45);
        System.out.print(true);
        System.out.println();

        System.setIn(null);
    }
}
