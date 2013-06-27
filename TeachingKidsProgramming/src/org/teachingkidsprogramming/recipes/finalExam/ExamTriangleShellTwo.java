package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellsize = MessageBox.askForNumericalInput("Pick a number for the size of a shell");
    if (shellsize < 300)
    {
      MessageBox.showMessage("Too Small");
      shellsize = MessageBox.askForNumericalInput("Pick a Number for the size of a shell");
    }
    else
    {
      for (int i = 1; i <= shellsize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shellsize / 150;
        length = length - largeLength;
        if (largeLength < 0)
        {
          length = length + 3;
        }
        else
        {
          drawTriangle();
        }
      }
    }
  }
  private static void drawTriangle()
  {
    Tortoise.move(length);
    Tortoise.turn(360 / 3.25);
  }
  {
    Tortoise.move(length);
    Tortoise.turn(360 / 3.25);
  }
}