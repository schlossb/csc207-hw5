package hw;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest
{

  @Test
  public void
    binaryTester ()
      throws Exception
  {
    int[] temp;
    boolean thrown = false;
    for (int s = 1; s < 33; s++)
      {
        temp = new int[s];
        for (int x = 0; x < s; x++)
          {
            temp[x] = 2 * x - 1;
          }// Build and initialize array
        for (int i = 0; i < s; i++)
          {
            thrown = false;
            assert ((BinarySearch.binarySearch (2 * i, temp) == i));
            // assert ((BinarySearch.binarySearch (2*i+1, temp) == -1)); For
            // testing purposes, see note at bottom

            try
              {
                BinarySearch.binarySearch (2 * i + 1, temp);
              }// End Try
            catch (Exception g)
              {
                thrown = true;
                assertTrue (thrown);
              }// End catch
          }// End processing this array
      }// End Array processing
  }// End Tester
  /*
   * Note:
   *  this tester in it's current form does not properly test for
   * exceptions when searching the array for odd numbers. It checks once, and
   * then quits. I was unable to make it repeatedly check for exceptions. The
   * code as it is is my most recent attempt. However, to test the correctness
   * of binary search, I temporarily removed the throw exception line, and
   * replace it with return -1. Instead of asserting an exception (as seen
   * commented out above), I asserted -1, and it passed the tests.
   */
  
}//End BinarySearchTest
