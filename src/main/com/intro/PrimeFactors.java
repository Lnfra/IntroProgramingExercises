package com.intro;

/*
  Prime Factors Exercise
  Write a method generate(int n) that given an integer N will return a list
  of integers such that the numbers are the factors of N and are arranged in
  increasing numerical order.

  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

  /*
   * Prime factorization or integer factorization of a number is finding out
   * the set of prime numbers which multiply together to give the original integer.
   *
   * A prime number is a whole number greater than 1,
   * which can only be exactly divided by 1 and itself.
   */

  public List<Integer> generate(int inputNum ) {

    int n = inputNum;
    List<Integer> factorsFound = new ArrayList<>();

    //from 2 till n
    for (int i = 2; i <= n; i++) {

      while (n % i == 0) {
        //if any num can divide the input exactly it is a factor. Add it to list.
        factorsFound.add(i);

        //divide the input by that factor, and find the next factor
        n = n / i;
      }
    } //end for loop

    Collections.sort( factorsFound );

    //returns the list of all factors which when multiplied together will get the original integer.
    return factorsFound;
  }

}
