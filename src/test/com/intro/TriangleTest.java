package com.intro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 14/12/16.
 */
public class TriangleTest {

  private Triangle tri;

  @Before
  public void setUp() throws Exception {
    tri = new Triangle();
  }

  @Test
  public void printAsteriskTest() throws Exception {
    String result = tri.printAsterisk();
    assertEquals("*", result);
  }

  @Test
  public void printHorizontalLineTest() throws Exception {
    String result = tri.printHorizontalLine(8);
    String expected = "********";
    assertEquals(expected, result);
  }
}