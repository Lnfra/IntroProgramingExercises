package com.intro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 14/12/16.
 */
public class DiamondTest {

  private Diamond dia;

  @Before
  public void setUp() throws Exception {
    dia = new Diamond();
  }

  @Test
  public void printIsoscelesTriangleTest() throws Exception {
    String result = dia.printIsoscelesTriangle(3);
    String expected = "  *\n" + " ***\n" + "*****\n";
    assertEquals(expected, result);
  }

  @Test
  public void printDiamondTest() throws Exception {
    String result = dia.printDiamond(3);
    String expected = "  *\n" + " ***\n" + "*****\n" + " ***\n" + "  *\n";
    assertEquals(expected, result);

  }

  @Test
  public void printDiamondWithNameTest() throws Exception {
    String result = dia.printDiamondWithName(3, "Angeline");
    String expected = "   *\n" + "  ***\n" + "Angeline\n" + "  ***\n" + "   *\n";
    assertEquals(expected, result);

  }

  @Test
  public void printDiamondWithNameTest2() throws Exception {
    String result = dia.printDiamondWithName(5, "Angeline");
    String expected = "   *\n" + "  ***\n" +  " *****\n" + "*******\n" + "Angeline\n"
                      + "*******\n" +  " *****\n" + "  ***\n" + "   *\n";
    assertEquals(expected, result);

  }
}