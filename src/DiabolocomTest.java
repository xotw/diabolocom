import java.util.ArrayList;
import java.util.List;

public class DiabolocomTest {

    public DiabolocomTest() {
    }

    // A function to find
    // factorial of a given number
    static int factorial(int n)
    {
        int res = 1;

        // Calculate value of
        // [1*(2)*---*(n-k+1)] /
        // [k*(k-1)*---*1]
        for (int i = 1; i <= n; ++i)
        {
            res *= i;
        }

        return res;
    }

    static int binomialCoeff(int n,
                             int k)
    {
        int res = 1;

        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;

        // Calculate value of
        // [n*(n-1)*---*(n-k+1)] /
        // [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }


    // A Binomial coefficient
    // based function to find
    // nth catalan number in
    // O(n) time
    static int catalan( int n)
    {
        // Calculate value of 2nCn
        int c = binomialCoeff(2 * n, n);

        // return 2nCn/(n+1)
        return c / (n + 1);
    }

    // A function to count number of
    // BST with n nodes using catalan
    static int countBST( int n) {
        // find nth catalan number
        int count = catalan(n);

        // return nth catalan number
        return count;
    }

    // A function to count number
    // of binary trees with n nodes
    static int countBT(int n)
    {
        // find count of BST
        // with n numbers
        int count = catalan(n);

        // return count * n!
        return count * factorial(n);
    }


    /*
     * Complete the 'numBST' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY nodeValues as parameter.
     */

    public List<Integer> numBST(List<Integer> nodeValues) {
        // Write your code here
        if (nodeValues.size() > 1000) {
            throw new ArrayIndexOutOfBoundsException();
        }

        ArrayList<Integer> resultList = new ArrayList<Integer>();

        for (Integer i : nodeValues) {
            if (i < 0 || i > 1000 ) {
                throw new ArithmeticException();
            }

            int resultNum = countBST(i);
            resultList.add(resultNum);

        }
        return resultList;
    }

}

