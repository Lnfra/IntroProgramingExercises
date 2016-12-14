package com.intro;

/*
  FizzBuzz Exercise
  FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz"
  instead of numbers adhering to certain rules.

  Create a FizzBuzz() method that prints out the numbers 1 through 100.
  Instead of numbers divisible by three print "Fizz".
  Instead of numbers divisible by five print "Buzz".
  Instead of numbers divisible by three and five print "FizzBuzz".

  Sample Output:
  1
  2
  Fizz
  4
  Buzz
  Fizz
  7
  8
  Fizz
  Buzz
  11
  Fizz
  13
  14
  FizzBuzz
*/

public class FizzBuzz {

  /*
   * Helper used by FizzBuzz() to check the output for each number
   */
  String testForFizzBuzz(int input) {
    if ( (input % 3 == 0) && (input % 5 == 0) ) {
      return "FizzBuzz";
    }
    else if ((input % 3 == 0)) {
      return "Fizz";
    }
    else if ((input % 5 == 0)) {
      return "Buzz";
    }
    else {
      return Integer.toString(input);
    }
  }

  public String fizzBuzz() {
    StringBuilder builder = new StringBuilder();

    //Tests numbers 0 to 100
    for (int num = 1; num <= 100; num++) {

      String output = testForFizzBuzz(num);
      System.out.println(output);
      builder.append(output + "\n");

    }
    return builder.toString();
  }
}
