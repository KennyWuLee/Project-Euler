import java.util.LinkedList;

public class Problem7 {
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
    while(primes.size() < 10001) {
      if(isPrime(i, primes))
        primes.add(i);
      i++;
    }
    System.out.println(primes.getLast());
  }
}
