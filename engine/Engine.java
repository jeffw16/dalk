public class Engine {
  public void run() {
    // this room position really needs to be switched to the Room.java file. Engine.java should
    // call Room.java's "select room" function
    while ( true ) {
      switch ( Player.room ) {
        case "Spawn":
        rooms.Spawn.run();
        break;
        
        //ETC
      }
    }
  }
}
