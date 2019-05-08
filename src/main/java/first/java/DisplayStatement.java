package first.java;

import java.util.ArrayList;

public class DisplayStatement {

  public static String display(ArrayList transactions){
    String displayOutput = "date || credit || debit || balance\n";
    for (int i = transactions.size() - 1; i >= 0; i--) {
      displayOutput += transactions.get(i);
    }
    return displayOutput;
  }

}
