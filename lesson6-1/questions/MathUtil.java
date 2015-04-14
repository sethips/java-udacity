
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
   public int largestPowerOf2(int n)
   {
      int powerOf2 = 2;
      while (powerOf2 * 2 < n)
      {
          powerOf2 *= 2;
      }
      return powerOf2;
   }
}
