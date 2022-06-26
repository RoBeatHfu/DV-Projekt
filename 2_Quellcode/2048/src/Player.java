
public class Player {

	private String name;
	private String password;
	private int[] game = new int[16];
	
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
	
	public void setGame() {
		
	}
}
