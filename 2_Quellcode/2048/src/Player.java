
public class Player {

	private String name;
	private String password;
	private String game;
	
	public Player(String nickname, String password) {
		name = nickname;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setGame(String allFields) {
		game = allFields;
	}
	
	
}
