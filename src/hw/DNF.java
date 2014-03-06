package hw;

public class DNF
{
  public void
    swap (String[] vals, int x, int y)
  {
    String temp = vals[x];
    vals[x] = vals[y];
    vals[y] = temp;
  }// End Swap

  /**
   * Rearrange vals so that red values precede white values and white values
   * precede blue values.
   * 
   * @post Exist P and Q, 0 <= P <= Q <= vals.length, s.t. For all i, 0 <= i <
   *       P, classifier.classify(vals[i]) < 0 For all i, P <= w < Q,
   *       classifier.classify(vals[i]) == 0 For all i, Q <= i < vals.length,
   *       classifier.classify(vals[i]) > 0 Values have neither been added to
   *       nor removed from vals; the new vals is a permutation of the original.
   */
  public void
    dnf (String[] vals, StringClassifier classifier)
  {
    int lo = 0;
    int mid = 0;
    int hi = vals.length - 1;
 /*
   * Invariant: classify (vals[n < mid]) = <-1, classify (vals[lo < n < mid] = 0, classify (vals [n>hi] = > 1
   */
    while (mid <= hi)
      {

        if ((classifier.classify (vals[mid])) < 0)
          {
            swap (vals, lo, mid);
            mid++;
            lo++;
          }// End if string < 5 char
    
        else if ((classifier.classify (vals[mid])) > 0)
          {
            swap (vals, mid, hi);
            hi--;
          }// End if string length is > 5 char
        else 
          {    
            mid++;
          }// End if string is 5 char

      }// End while loop

  }// dnf

} // class

