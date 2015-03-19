public abstract class LootRoom extends Room
{
  public boolean looted = false;
  public ArrayList<Item> loot;
  
  public void addItems();
  
  @Override
  public void print()
  {
    super.print();
    for(int i=super.directions.length+2;i<loot.size();i++)
    {
      System.out.println(i+". "+loot.get(i-(super.directions.length+2));
    }
  }
}
