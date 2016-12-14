package com.intro;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 14/12/16.
 */
public class PrimeFactorsTest {

  private PrimeFactors pf;

  @Before
  public void setUp() throws Exception {
    pf = new PrimeFactors();
  }

  @Test
  public void generate30Test() throws Exception {
    List<Integer> result = pf.generate(30);
    List<Integer> expected = Arrays.asList(2,3,5);
    assertEquals(expected, result);
  }

  @Test
  public void generate20Test() throws Exception {
    List<Integer> result = pf.generate(20);
    List<Integer> expected = Arrays.asList(2,2,5);
    assertEquals(expected, result);
  }

  @Test
  public void generate72Test() throws Exception {
    List<Integer> result = pf.generate(72);
    List<Integer> expected = Arrays.asList(2,2,2,3,3);
    assertEquals(expected, result);
  }
}