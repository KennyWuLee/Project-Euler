public class Problem69 {
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

  public static void main(String[] args) {
    int maxN = 1;
    int maxPhi = 1;
    int phi;
    for(int n = 2; n <= 1000000; n++) {
      phi = totient(n);
      if((long)n * maxPhi > (long)maxN * phi) {
        maxN = n;
        maxPhi = phi;
      }
    }
    System.out.println(maxN);
  }
}
