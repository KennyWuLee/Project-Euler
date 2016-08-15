public class Problem9 {
  public static void main(String[] args) {
    // a = 1000(b-500)/(b-1000)
    for (int b = 1; b < 334; b++) {
      if(1000*(b-500) % (b-1000) == 0)
        System.out.println(b);
    }
  }
}
