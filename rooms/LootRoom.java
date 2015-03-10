public abstract class LootRoom extends Room
{
  boolean looted = false;
  ArrayList<Items.Item> loot;
  
  public void addItems();
}
