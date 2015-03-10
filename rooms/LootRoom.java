public abstract class LootRoom extends Room
{
  public boolean looted = false;
  public ArrayList<Items.Item> loot;
  
  public void addItems();
}
