public class Player
{
  public static double maxHealth=100;
  public static double health= 100; //not sure if should be int or double
  
  public void changeHp(double amount)
  {
    health+=this.amount;
    if(heath>maxHealth)
    {
      health=maxHealth;
    }
    else if(health<=0)
    {
      health=0;
      System.out.println("\nYou Died!\n");
    }
  }
}
