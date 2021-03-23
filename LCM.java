import java.util.*;

public class LCM {
  static long LCMc(long a,long b){
    return  (a*b)/(GCD(a,b));
  }

  static long GCD (long a,long b){
    if(b==0)return a;
    return GCD(b,a%b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a,b;
    a = scanner.nextLong();
    b = scanner.nextLong();
    System.out.println(LCMc(a, b));

  }
}
