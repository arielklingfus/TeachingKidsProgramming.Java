package org.teachingkidsprogramming.recipes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fizzbuzztest
{
  @Test
  public void test1producers1()
  {
    assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void test2producers2()
  {
    assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3producersfizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4producers4()
  {
    assertEquals("4", FizzBuzz.convert(4));
  }
  @Test
  public void test5producersBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void test6producersfizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void test10producersBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(10));
  }
  @Test
  public void test15producersBuzz()
  {
    assertEquals("FizzBuzz", FizzBuzz.convert(15));
  }
}
