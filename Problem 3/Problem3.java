public class Problem3 {
  public static void main(String args[]) {
    int div = 2;
    long remainder = 600851475143L;
    while(div <= remainder) {
      while(remainder % div == 0) 
        remainder /= div;
      if(remainder == 1)
        System.out.println(div);
      div++;
    }
  }
}
