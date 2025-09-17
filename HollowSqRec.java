public class HollowSqRec {

    static void printStar(int starCount, int row) {
        if (starCount <= 0) {
            return;
        }
        if (row == 1 || row == 5 || starCount == 5 || starCount == 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        printStar(starCount - 1, row);
    }

    static void printHollowSq(int row, int col) {
        if (row <= 0) {
            return;
        }
        printStar(col, row);
        System.out.println();
        printHollowSq(row - 1, col);
    }

    public static void main(String[] args) {
        HollowSqRec.printHollowSq(5, 5);
    }
}
