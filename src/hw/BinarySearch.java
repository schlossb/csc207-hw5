package hw;

public class BinarySearch
{
  /**
   * Search for val in values, return the index of an instance of val.
   * 
   * @param val
   *          An integer we're searching for
   * @param values
   *          A sorted array of integers
   * @result index, an integer
   * @throws Exception
   *           If there is no i s.t. values[i] == val
   * @pre values is sorted in increasing order. That is, values[i] < values[i+1]
   *      for all reasonable i.
   * @post values[index] == val
   */
  public static int
    binarySearch (int i, int[] vals)
      throws Exception
  {
    // Mid is the current index, upper is the upper bound of the array left to
    // be searched, lower is the lower bound.
    // Initializes mid, upper, lower
    int mid = vals.length / 2;
    int upper = vals.length - 1;
    int lower = 0;
    // Loop iterates through array until i is found or the entire array has been
    // searched, either directly or transitively
    while (upper >= lower)
      {
        // Gets new midpoint
        mid = lower + (upper - lower) / 2;
        // If val at index mid = i, return mid
        if (vals[mid] == i)
          {
            return mid;
          }// end value found
        else if (vals[mid] < i)
          {
            lower = mid + 1;
          }// end if i < val at index mid
        else
          {
            upper = mid - 1;
          } // end if i > val at index mid
      }// End array search, i not found throw exception
   throw new Exception ("Key_Not_Found");
    //return -1; For testing purposes, see note at end of BinarySearchTest.java
  } // binarySearch

  public static void
    main (String[] args)
      throws Exception
  {
    int[] vals = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println (binarySearch (6, vals));
  }
}
