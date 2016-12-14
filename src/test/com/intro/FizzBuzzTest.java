package com.intro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 14/12/16.
 */
public class FizzBuzzTest {

  private FizzBuzz fb;

  @Before
  public void setUp() throws Exception {
    fb = new FizzBuzz();
  }

  @Test
  public void printFizzBuzzInput1Test() throws Exception {
    String result = fb.testForFizzBuzz(1);
    String expected = "1";
    assertEquals(expected, result);
  }

  @Test
  public void printFizzBuzzInput3Test() throws Exception {
    String result = fb.testForFizzBuzz(3);
    String expected = "Fizz";
    assertEquals(expected, result);
  }

  @Test
  public void printFizzBuzzInput5Test() throws Exception {
    String result = fb.testForFizzBuzz(5);
    String expected = "Buzz";
    assertEquals(expected, result);
  }

  @Test
  public void printFizzBuzzInput15Test() throws Exception {
    String result = fb.testForFizzBuzz(15);
    String expected = "FizzBuzz";
    assertEquals(expected, result);
  }

  @Test
  public void printFizzBuzzInput100Test() throws Exception {
    String result = fb.testForFizzBuzz(100);
    String expected = "Buzz";
    assertEquals(expected, result);
  }

  @Test
  public void printFizzBuzzTestAll() throws Exception {
    String output = fb.fizzBuzz();
    assertNotNull(output);
  }
}