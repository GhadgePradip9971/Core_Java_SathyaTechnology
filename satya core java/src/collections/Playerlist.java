package collections;

public class Playerlist {

	int playerid;
	String playername;
	String team;
	int age;
	double Auction_price;

	public Playerlist(int playerid, String playername, String team, int age, double auction_price) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.team = team;
		this.age = age;
		this.Auction_price = auction_price;

	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAuction_price() {
		return Auction_price;
	}

	public void setAuction_price(double auction_price) {
		Auction_price = auction_price;
	}

	@Override
	public String toString() {
		return "Playerlist [playerid=" + playerid + ", playername=" + playername + ", team=" + team + ", age=" + age
				+ ", Auction_price=" + Auction_price + "]";
	}

}
