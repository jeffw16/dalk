public class Engine {
  public void run() {
    // call user
    User user = new User();
    // if user exists, run something, else make user profile
    GetInput getinput = new GetInput();
    String username = getinput.request( "string", "Username:" );
    if ( !user.exists ( username ) ) {
      user.makeProfile();
    }
    // start process
    // removed function, added to Room.java
    Room room = new Room ( user.getRoom() );
  }
}
