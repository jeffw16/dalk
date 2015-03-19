/**
 * MyWikis
 * Dalk
 * Rooms.java
 * @authors CJ Duffee, Jeffrey Wang
*/

import java.util.Scanner;

public abstract class Room 
{
  public static String unvisitedText = "You are in a generic room.";
  public static boolean visited = false;
  public static String visitedText = "You are in a visited generic room";
  public static direction[] directions = new direction[2];
  directions = {new direction("Go North to Generic Room", "roomName"), new direction("GO SOUTH TO GENERIC ROOM","roomName")}
  
  
  public void print()
  {
    if( !visited ) {
      visited = true;
      System.out.println(unvisitedText);
    } else {
      System.out.println (visitedText);
    }
    // This code should probably move to a generic call to the engine. AGREED. 
    System.out.println("What do you want to do?");
    System.out.println("1. Open Inventory");
    
    for(int i=0;i<directions.length2;i++)
    {
      System.out.println((i+2)+". "+directions[i].text);
    }
  }
  
  public void run()
  {
    print();
    Scanner scanny = new Scanner();
    int i = scanny.nextInt();
    scanny.nextLine();
    
    if(i==1)
    {
      //Open Inventory
    }
    else if(i<= (directions.length)+1)
    {
      Player.room=directions[i-1];
    }
  }
}
