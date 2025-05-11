class Leet14 {
  static int reverseBits(int n) {
    int ans = 0;

    for (int i = 0; i < 32; ++i)
      if ((n >> i & 1) == 1)
        ans |= 1 << 31 - i;

    return ans;
  }

  public static void main(String[] args) {
    System.out.println(reverseBits(12));
  }
}