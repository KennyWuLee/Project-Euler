import java.util.LinkedList;

public class Problem10 {
  public static boolean isPrime(int n, LinkedList<Integer> primes) {
    for(int p : primes) {
      if(n % p == 0)
        return false;
      if(p * p > n)
        return true;
    }
    return true;
  }

  public static void main(String[] args) {
    LinkedList<Integer> primes = new LinkedList<Integer>();
    int i = 2;
    while(i < 2000000) {
      if(isPrime(i, primes))
        primes.add(i);
      i++;
    }
    long sum = 0;
    for(int p : primes)
      sum += p;
    System.out.println(sum);
  }
}
