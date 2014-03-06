package hw;

public class Expt
{
  /**
   * Compute x^n.
   * 
   * @pre n >= 1.
   */
  public static double
    expt (double x, int n)

  {
    // Values for computation
    double temp = x;
    double modified;
    // modified n
    int m = n;
    // if exponent is 0, return 1
    if (m == 0)
      return 1;
    // if exponent is odd, start modified at temp;
    if ((m % 2) == 1)
      modified = temp;
    // else if exponent is even start at 1;
    else
      modified = 1;
    // divide exponent by 2;
    m = m / 2;
    // While exponent isn't 0
    while (m > 0)
      {
        temp = temp * temp;
        if ((m % 2) == 1)
          {
            if (modified == 1)
              modified = temp;
            else
              modified = temp * modified;
          }//end if odd expt
        m = m / 2;
      }//end while loop, all exponents calculated
        return modified;
  } // expt(double, int)


  public static void
    main (String[] args)
  {
    System.out.print (4 + " to the " + 12 + "th power = " + expt (4, 24));

  }
}

