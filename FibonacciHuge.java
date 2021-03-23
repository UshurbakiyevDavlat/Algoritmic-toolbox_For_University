import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long prevFib = 0;
        long nextFib = 0;
        long curFib = 1;

        ArrayList<Long>cached = new ArrayList<Long>();

        cached.add(prevFib);
        cached.add(curFib);

        for(int i = 1;i<n;i++) {
            nextFib = curFib;
            curFib = (curFib + prevFib) % m;
            prevFib = nextFib;

            if (prevFib == 0 && curFib == 1) {
                cached.remove(i);
                break;
            } else {
                cached.add(curFib);
            }

        }
        long offset  = n % cached.size();
       return cached.get(Math.toIntExact(offset));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

