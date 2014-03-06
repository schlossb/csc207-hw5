package hw;

import java.util.Random;

public class SkipListofStrings
    implements
      SetofStrings
{
  final int MAX_LEVEL = 14;
  final double p = .5;
  Random rand = new Random ();

  public int
    levelGen ()
  {
    for (int i = 1; i < MAX_LEVEL; i++)
      {
        if (rand.nextDouble () < (1 - p))
          return i;
      }// End For
    return MAX_LEVEL;
  }// End levelGen


  public boolean
    contains (String str)
  {
    return false;
    // stub
  } // End Contains

  public void
    add (String str)
  {
    // stub
  } // End add

  public void
    remove (String str)
  {
    // stub
  } // End Remove
} // End SkipListofStrings
