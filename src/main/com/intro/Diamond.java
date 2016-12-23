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

  public String printDiamond(int size) {
    /*
      Observed that if the center horizontal str is considered level 3
      To create the diamond pattern we can, put level 2 on the top and bottom of level 3
      and put level 1 on the top and bottom of that to form the below

       Level 1 = (2 space) + (level * 2 - 1 asterisks)
       Level 2 = (1 space) + (level * 2 - 1 asterisks)
       Level 3 = (0 space) + (level * 2 - 1 asterisks)
       Level 2 = (1 space) + (level * 2 - 1 asterisks)
       Level 1 = (2 space) + (level * 2 - 1 asterisks)

       As the level get further from the middle the space increases
     */

    StringBuilder builder = new StringBuilder();
    int numOfSpaces = 0;

    for (int level = size; level > 0 ; level--) {

      String spaceStr = Triangle.buildString(numOfSpaces, " ");
      String asteriskStr = Triangle.buildString(level * 2 - 1, "*") + "\n";

      if(level == size){
        //if in the center level
        builder.append(spaceStr + asteriskStr );
      }
      else {
        //prepend to the top
        builder.insert(0, spaceStr + asteriskStr);
        //append to the bottom
        builder.append(spaceStr + asteriskStr);
      }

      numOfSpaces++;
    }

    String output = builder.toString();
    System.out.println(output);
    return output;
  }

/*
  Diamond with Name
  Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
    *
   ***
   Bill
   ***
    *
*/

  public String printDiamondWithName(int size, String name) {
    /*
      Observed that if the name is the middle row
      To create the diamond pattern we can, put level 2 on the top and bottom of the name
      and put level 1 on the top and bottom of that to form the below

       Level 1 = (name.length - (level * 2 - 1 asterisks)/2 spaces) + (level * 2 - 1 asterisks)
       Level 2 = (name.length - (level * 2 - 1 asterisks)/2 spaces) + (level * 2 - 1 asterisks)
       Level 3 = (0 space) + name
       Level 2 = (name.length - (level * 2 - 1 asterisks)/2 spaces) + (level * 2 - 1 asterisks)
       Level 1 = (name.length - (level * 2 - 1 asterisks)/2 spaces) + (level * 2 - 1 asterisks)

       As the level get further from the middle the space increases depending on the length on the name
     */

    StringBuilder builder = new StringBuilder();

    //At the center level, append the name
    builder.append(name + "\n");

    //Add all other levels above and below the center
    for (int level = size - 1; level > 0 ; level--) {

      int numOfAsterisks = level * 2 - 1;
      String asteriskStr = Triangle.buildString(numOfAsterisks, "*") + "\n";

      int numOfSpaces = (name.length() - numOfAsterisks) / 2;
      String spaceStr = Triangle.buildString(numOfSpaces, " ");

      //prepend to the top
      builder.insert(0, spaceStr + asteriskStr);
      //append to the bottom
      builder.append(spaceStr + asteriskStr);

    }

    String output = builder.toString();
    System.out.println(output);
    return output;
  }

}
