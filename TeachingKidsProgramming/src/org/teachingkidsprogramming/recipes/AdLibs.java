package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new words();
    String currentAdverb = MessageBox.askForTextInput("Enter an Adverb");
    String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    String currentBodyPart = MessageBox.askForTextInput("Enter a Body Part");
    String currentStory = Parser.parse("Today I woke[currentAdverb]", null);
    currentStory += " I woke " + currentAdverb + ".";
    currentStory += " Then I " + currentEdVerb + " ";
    currentStory += " my " + currentBodyPart + ".";
    MessageBox.showMessage(currentStory);
  }
}