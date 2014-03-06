package hw;

public class DnfExpt
{
  public static void
    arrayprint (String[] vals)
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);

    for (int i = 0; i < vals.length; i++)
      {
        pen.println (vals[i] + " ");
      }//End printing vals
  }//End array print

  public static void
    main (String[] args)
      throws Exception
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
    String[] vals = { "hi", "ratchet", "clank", "butter", "boo", "fiver",
                     "tapdancer", "cowboy" };
    String[] vals2 = { "666666", "7777777", "88888888", "1", "22", "55555",
                      "4444", "333", "55555", "55555" };
    String[] vals3 = { "low", "low", "low", "low", "middy", "middy", "middy",
                      "highest", "highest", "highest" };
    String[] vals4 = { "highest", "highest", "highest", "low", "low", "low",
                      "low", "middy", "middy", "middy", };
    SimpleStringSizeCalculator classy = new SimpleStringSizeCalculator ();
    DNF sorter = new DNF ();
    pen.println ("-----Now sorting and printing vals -----");
    sorter.dnf (vals, classy);
    arrayprint (vals);
    pen.println ("-----Now sorting and printing vals2-----");
    sorter.dnf (vals2, classy);
    arrayprint (vals2);
    pen.println ("-----Now sorting and printing vals3-----");
    sorter.dnf (vals3, classy);
    arrayprint (vals3);
    pen.println ("-----Now sorting and printing vals4-----");
    sorter.dnf (vals4, classy);
    arrayprint (vals4);
  } // End main 
}//end DNF Experiments
