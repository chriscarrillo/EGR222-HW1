/**
 * Created by Chris Carrillo for EGR222
 * This program calls a series of methods that print a rocket according
 * to the inputted size.
 *
 */
public class DrawRocket {
    // Creates constant SIZE variable
    public static final int SIZE = 3;
    public static void main(String[] args) {
        drawTop();
        drawLine();
        drawTopDiamonds();
        drawBottomDiamonds();
        drawLine();
        drawBottomDiamonds();
        drawTopDiamonds();
        drawLine();
        drawTop();
    }

    // printStr prints a given string a given # of times
    private static void printStr(int n, String str){
        for(int i = 0 ; i < n ; i++)
            System.out.print(str);
    }

    // drawTop draws the top of the rocket. The number of slashes change based on the SIZE variable.
    public static void drawTop() {
        for (int line = 1; line <= (SIZE + (SIZE - 1)); line++) {
            printStr(-1 * line + (SIZE * 2), " ");
            printStr(line, "/");
            printStr(2, "*");
            printStr(line, "\\");
            System.out.println();
        }
    }

    // drawLine draws the line that separates each section. The =* changes based on the SIZE.
    public static void drawLine() {
        System.out.print("+");
        printStr(SIZE * 2, "=*");
        System.out.print("+");
        System.out.println();
    }

    // drawTopDiamonds draws the top part of the diamonds. The # of dots change based on the size.
    public static void drawTopDiamonds() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int twice = 1; twice <= 2; twice++) {
                printStr(-1 * line + SIZE, ".");
                printStr(line, "/\\");
                printStr(-1 * line + SIZE, ".");
            }
            System.out.println("|");
        }
    }

    // drawBottomDiamonds draws the bottom part of the diamonds. The # of dots change based on the size.
    public static void drawBottomDiamonds() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int twice = 1; twice <= 2; twice++) {
                printStr(-1 * line + SIZE, ".");
                printStr(line, "\\/");
                printStr(-1 * line + SIZE, ".");
            }
            System.out.println("|");
        }
    }
}