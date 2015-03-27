import java.util.ArrayList;

public class Player
{
  public static String room = "spawn";
  public static double maxHealth = 100;
  public static double health = 100;
  public static String username = "nousername";
  // ^ it is best for health to be double for accuracy and future compatibility purposes (see RuneScape healthpoints)
  
  public ArrayList<item.Item> inventory = new ArrayList();
  
  public void changeHp (double amount) {
    health += this.amount;
    if (heath > maxHealth) {
      health = maxHealth;
    } else if ( health <= 0 ) {
      health = 0;
      System.out.println("\nYou died!\n");
    }
  }
  
  public void setUsername ( String inputUsername ) {
    username = inputUsername;
  }
  public String getUsername () {
    return username;
  }
}
