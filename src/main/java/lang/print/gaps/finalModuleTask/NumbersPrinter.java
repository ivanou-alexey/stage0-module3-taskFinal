package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isPositive = ((number >> 31) == 0);
        System.out.println(isPositive);
    }
}
