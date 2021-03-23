import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {

        static long  getMaxFast(long [] numbers){
        int n = numbers.length;
        int ind = 0;
        long max1 = 0 ;
        long max2 = 0;

        for(int i = 1 ; i< n; i++){
            if(numbers[i]>numbers[ind]){
                ind = i;
                max1 = numbers[ind];
            }
            max1 = numbers[ind];
        }
        int ind2 = 0;
            if(ind == 0){
                ind2 = 1;
            } else {
                ind2 = 0;
            }
        for(int j = 1 ; j<n; j++){
            if(j != ind && numbers[j]>numbers[ind2]){
                ind2 = j;
                max2 = numbers[ind2];
            }
            max2 = numbers[ind2];
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
