package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new Words();
    words.currentAdverb = MessageBox.askForTextInput("Enter an Adverb");
    words.currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in -ed");
    words.currentBodyPart = MessageBox.askForTextInput("Enter a Body Part");
    String currentStory = Parser.parseRtfFile("View.rtf", words);
    // MessageBox.showMessage(currentStory);
    Viewer.displayRtfFile(currentStory);
  }
}