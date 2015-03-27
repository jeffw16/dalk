public class Engine {
  public void run() {
    // call player
    Player player = new Player();
    // if user exists, run something, else make user profile
    GetInput getinput = new GetInput();
    if ( player.getUsername() == "nousername" ) {
      player.setUsername ( getinput.requestString ( "Username:" ) );
    }
    // start process
    Room room = new Room ( player.getRoom() );
  }
}
