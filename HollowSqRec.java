import java.util.Scanner;

public class HollowSqRec {
    static int rowCount;
    static int colCount;

    static void printStar(int starCount, int row) {
        if (starCount <= 0) {
            return;
        }
        if (row == 1 || row == rowCount || starCount == colCount || starCount == 1) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        rowCount = sc.nextInt();
        System.out.println("Please enter col");
        colCount = sc.nextInt();
        HollowSqRec.printHollowSq(rowCount, colCount);
    }
}
