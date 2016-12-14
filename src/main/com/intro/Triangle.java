package com.intro;

/**
 * Created by lnfra on 14/12/16.
 */
public class Triangle {

/*
  Print one asterisk to the console.
  Example: *
*/
  public String printAsterisk() {
    String asterisk = "*";
    System.out.println(asterisk);
    return asterisk;
  }


/*
  Draw a horizontal line
  Given a number n, print n asterisks on one line.
  Example when n=8:    ********
*/
  public String printHorizontalLine(int size) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < size ; i++) {
      builder.append("*");
    }

    String output = builder.toString();
    System.out.println(output);

    return output;
  }



/*
  Draw a vertical line
  Given a number n, print n lines, each with one asterisks
  Example when n=3:
    *
    *
    *
* /


/*
  Draw a right triangle
  Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
  Example when n=3:
    *
    **
    ***
*/

}
