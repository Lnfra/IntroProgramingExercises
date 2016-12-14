package com.intro;

/**
 * Created by lnfra on 14/12/16.
 */
public class Diamond {
/*
  Isosceles Triangle
  Given a number n, print a centered triangle. Example for n=3:
    *
   ***
  *****
*/
  public String printIsoscelesTriangle(int size) {
    /*
      Observed that:
       Level 1 = (2 space) + (level * 2 - 1 asterisks)
       Level 2 = (1 space) + (level * 2 - 1 asterisks)
       Level 3 = (0 space) + (level * 2 - 1 asterisks)
       As level decrease the space increase
     */

    StringBuilder builder = new StringBuilder();
    int numOfSpaces = 0;

    for (int level = size; level > 0 ; level--) {

      String spaceStr = Triangle.buildString(numOfSpaces, " ");
      String asteriskStr = Triangle.buildString(level * 2 - 1, "*") + "\n";

      builder.insert(0, spaceStr + asteriskStr );

      numOfSpaces++;
    }

    String output = builder.toString();
    System.out.println(output);
    return output;
  }

/*
  Diamond
  Given a number n, print a centered diamond. Example for n=3:
    *
   ***
  *****
   ***
    *
*/

/*
  Diamond with Name
  Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
    *
   ***
   Bill
   ***
    *
*/

}
