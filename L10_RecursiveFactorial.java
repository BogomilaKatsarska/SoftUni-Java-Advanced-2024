package JavaAdvanced;

public class L10_RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    private static long calculateFactorial(long i) {
        if (i == 1 ){
            return 1;
        }
        long result = i * calculateFactorial(i-1);
        return result;
    }
}
