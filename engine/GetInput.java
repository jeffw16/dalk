/**
  * Dalk
  * engine/GetInput.java
  * Gets the input from System.in
*/

import java.util.Scanner;
import java.util.Scanner.*;

public class GetInput {
  public String requestString ( String prompt ) {
    Scanner inputString = new Scanner ( System.in );
    System.out.println ( prompt );
    outputString = inputString.nextLine();
  }
}
