package Week1.ForLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Count to: ");
    int inputNum = Integer.parseInt(scanner.nextLine());
    scanner.close();

    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0; i <= inputNum; i++) {
      list.add(""+i);
    }
    String str = String.join(" ", list);
    System.out.print(str);
  }
}
