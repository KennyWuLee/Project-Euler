public class Problem2 {
  public static void main(String args[]) {
      int a = 0;
      int b = 1;
      int fib = a + b;
      int sum = 0;
      while(fib < 4000000) {
        if(fib % 2 == 0)
          sum += fib;
        a = b;
        b = fib;
        fib = a + b;
      }
      System.out.println(sum);
  }
}
