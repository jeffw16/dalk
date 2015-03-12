public class Engine
{
  public void run()
  {
    while(true)
    {
      switch(Player.room)
      {
        case "Spawn":
        rooms.Spawn.run();
        break;
        
        //ETC
      }
    }
  }
}
