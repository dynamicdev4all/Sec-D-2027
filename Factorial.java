public class Factorial {
      static int findFact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFact(num - 1);
    }

    public static void main(String[] args) {
        Factorial.findFact(5);
    }
}
