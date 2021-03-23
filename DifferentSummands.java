import java.util.*;

public class DifferentSummands {
    static void findPrize(int n) {
        int candy = n;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= candy; i++) {
            candy -= i; // candy(8) - i = 7 - i(2) = 5-i(3) = 2
            if (candy <= i) {
                arrayList.add(candy + i);
            } else if (candy == 0) {
                arrayList.add(i);
                break;
            } else {
                arrayList.add(i);
            }
        }

        System.out.println(arrayList.size());
        for(int z:arrayList){
            System.out.print(z+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrize(n);
    }
}

