package first.java;

import java.util.ArrayList;

public class DisplayStatement {

  private static DisplayStatement instance;

  private DisplayStatement(){};

  public static DisplayStatement getInstance() {
    if (instance == null){
      instance =new DisplayStatement();
    }

    return instance;
  }

  public String display(ArrayList transactions){
    String displayOutput = "date || credit || debit || balance\n";
    for (int i = transactions.size() - 1; i >= 0; i--) {
      displayOutput += transactions.get(i);
    }
    return displayOutput;
  }

}
