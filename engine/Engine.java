public class Engine {
  public void run() {
    // call player
    Player player = new Player();
    // if user exists, run something, else make user profile
    GetInput getinput = new GetInput();
    String username = getinput.requestString ( "Username:" );
    if ( !player.exists ( username ) ) {
      player.makeProfile();
    }
    // start process
    // removed function, added to Room.java
    Room room = new Room ( player.getRoom() );
  }
}
