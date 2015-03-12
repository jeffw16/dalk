/**
 * MyWikis
 * Dalk
 * Rooms.java
 * @authors CJ Duffee, Jeffrey Wang
*/

public abstract class Room {
  public final String unvisitedText = "You are in a generic room.";
  public boolean visited = false;
  public final String visitedText = "You are in a visited generic room";
  public direction[] directions = new direction[2];
  directions = {new direction("Go North to Generic Room", IDKFORIDSYSTEM), new direction("GO SOUTH TO GENERIC ROOM",IDKFORIDSYSTEM)}
  
  public String run()
  {
    if( !visited ) {
      visited = true;
      System.out.println( unvisitedText );
    } else {
      System.out.println( visitedText );
    }
    // This code should probably move to a generic call to the engine. AGREED.
    System.out.println("What do you want to do?");
    System.out.println("1. Open Inventory");
    
    for(int i=0;i<directions.length2;i++)
    {
      System.out.println((i+2)+". "+directions[i].text);
    }
  }
}
