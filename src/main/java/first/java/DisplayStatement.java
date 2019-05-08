package first.java;

import java.util.ArrayList;

public class DisplayStatement {

  public static String display(ArrayList transactions){
    String displayOutput = "date || credit || debit || balance\n";
    String lineBreak = "\n";
    for (int i = transactions.size() - 1; i >= 0; i--) {
      displayOutput += transactions.get(i);
      displayOutput += lineBreak;
    }
    return displayOutput;
  }

}
