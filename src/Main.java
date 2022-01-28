import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DiabolocomTest dTest = new DiabolocomTest();

        List<Integer> dbTest1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 100, 200, 500, 999);

        List<Integer> dbTest2 = Arrays.asList(-3, 3, 5, 6, 700);

        List<Integer> dbTest3 = Arrays.asList(1, 3, 5, 6, 1700);

        System.out.println(dTest.numBST(dbTest1));
        System.out.println();
    }

}