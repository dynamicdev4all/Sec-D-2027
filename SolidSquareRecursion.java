public class SolidSquareRecursion {

    static void printCol(int colCount) {
        if (colCount <= 0) {
            return;
        }
        System.out.print("*");
        printCol(colCount - 1);
    }

    static void printSolidSq(int row, int col) {
        if (row <= 0) {
            return;
        }
        printCol(col);
        System.out.println();
        printSolidSq(row - 1, col);
    }

    public static void main(String[] args) {
        SolidSquareRecursion.printSolidSq(5, 5);
    }
}
