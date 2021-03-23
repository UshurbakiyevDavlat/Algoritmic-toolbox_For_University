import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(long num) {
        if (num <= 1)
            return num;

        long prevFib = 0;
        long curFib = 1;
        long nextFib = 0;
        long lastD = 0;

        for(long i = 2 ;i<num;i++){
            nextFib = curFib;
            curFib = (curFib+prevFib)%10;
            prevFib = nextFib;
            if(i == num-1){
                lastD = (prevFib+curFib)%10;
                return lastD;
            }
        }
        return (prevFib+curFib)%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

