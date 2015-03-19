public abstract class LootRoom extends Room
{
  public boolean looted = false;
  public ArrayList<Item> loot;
  
  public void addItems();
  
  public void run()
  {
    super.run();
    for(int i=super.directions.length+2;i<loot.size();i++)
    {
      System.out.println(i+". "+loot.get(i-(super.directions.length+2));
    }
  }
}
