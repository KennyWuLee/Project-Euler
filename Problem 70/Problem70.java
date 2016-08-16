import java.util.LinkedList;

public class Problem70 {
  public static String sortString(String s) {
    char[] a = s.toCharArray();
    quicksort(a, 0, a.length-1);
    return new String(a);
  }

  public static void quicksort(char[] a, int lo, int hi) {
    if(hi > lo) {
      int p = partition(a, lo, hi);
      quicksort(a, lo, p-1);
      quicksort(a, p+1, hi);
    }
  }

  public static int partition(char[] a, int lo, int hi) {
    char pivot = a[hi];
    int i = lo;
    for(int j = lo; j < hi; j++)
      if(a[j] <= pivot) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
      }
    char temp = a[i];
    a[i] = a[hi];
    a[hi] = temp;
    return i;
  }

  public static int totient(int n) {
    int remainder = n;
    int divisor = 2;
    while(remainder > 1) {
      if(remainder % divisor == 0) {
        while(remainder % divisor == 0)
          remainder /= divisor;
        n = (int)((long)n * (divisor - 1) / divisor);
      }
      divisor++;
    }
    return n;
  }

  public static boolean isPrime(int n, LinkedList<Integer> primes) {
    for(int p : primes) {
      if(n % p == 0)
        return false;
      if(p * p > n)
        return true;
    }
    return true;
  }

  static LinkedList<Integer> primes = new LinkedList<Integer>();

  public static void genPrimes() {
    int i = 2;
    while(primes.size() < 4000) {
      if(isPrime(i, primes))
        primes.add(i);
      i++;
    }
  }

  public static void main(String[] args) {
    genPrimes();

    int currN = 2;
    int currPhi = 1;

    //if(sortString(""+i).equals(sortString(""+phi)))
    int n, phi;
    for(int a : primes)
      for(int b : primes) {
        n = a*b;
        if(a*b > 1e7)
          break;
        phi = totient(n);
        if(sortString(""+n).equals(sortString(""+phi)) && (long)n * currPhi < (long)currN * phi) {
          currN = n;
          currPhi = phi;
          System.out.println(currN + "/" + currPhi);
        }
      }
  }
}
