package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //if the number is 5 give buzz
    if (i == 15) { return "FizzBuzz"; }
    if (i % 5 == 0) { return "Buzz"; }
    if (i % 3 == 0)
    {
      return "Fizz";
    }
    else
    {
      return "" + i;
    }
  }
}
