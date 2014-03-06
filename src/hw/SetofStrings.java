package hw;

public interface SetofStrings
{
  /**
   * Determine if the set contains a particular string.
   */
  public boolean
    contains (String str);

  /**
   * Add an element to the set.
   * 
   * @post contains(str)
   */
  public void
    add (String str);

  /**
   * Remove an element from the set.
   * 
   * @post !contains(str)
   */
  public void
    remove (String str);
} // interface SetOfStrings

