import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int num) {

    long t = System.currentTimeMillis();
    int prevFib = 0;
    int curFib = 1;
    int nextFib =0;

    if(num<=1){
      return num;
    }

    for(int i = 1;i<num;i++){
      nextFib = curFib;
      curFib = curFib + prevFib;
      prevFib = nextFib;
    }


    return curFib;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
