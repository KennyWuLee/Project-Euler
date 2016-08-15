public class Problem4 {
  public static boolean isPalindrome(int n) {
    String number = Integer.toString(n);
    for (int i = 0; i < number.length() / 2; i++)
      if(number.charAt(i) != number.charAt(number.length()-1-i))
        return false;
    return true;
  }

  public static void main(String[] args) {
    int max = 0;
    for(int i = 100; i < 1000; i++)
      for(int j = 100; j <= i; j++) {
        int product = i * j;
        if(product > max && isPalindrome(product))
          max = product;
      }
    System.out.println(max);
  }
}
