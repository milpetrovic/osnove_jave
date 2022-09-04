package MiniProjekat;

import java.util.ArrayList;

public class XandOGame {
	
	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;
	
	public XandOGame() {
		for(int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		
	}

	public XandOGame(Player playerX, Player playerO) {
		super();
		for(int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		this.playerX = playerX;
		this.playerO = playerO;
	}
	
	

	public ArrayList<String> getTable() {
		return table;
	}

	public void setTable(ArrayList<String> table) {
		this.table = table;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	
	public void print() {
		for(int i = 0; i < 9; i++) {
			if(i % 3 == 0) {
				System.out.println();
			} System.out.print(this.table.get(i) + " | ");
				
			}
			
	}
	
	public void startGame() {
		for(int i = 0; i < 9; i++) {
			this.table.add(" ");
		} 
		this.nextPlayer = "x";
	}
	
	public boolean isGameOver() {
		int provera = 0;
		for(int i = 0; i < 9; i++) {
			if(this.table.get(i) == " ")
		          return false;
		}return true;
	}
	
	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		
		if(this.table.get(pozicija) != "x" && this.table.get(pozicija) != "o" ){ 
			return true;
		
		} else return false;
		
	}
	
	public void playNext() {
		if(this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else this.nextPlayer = "x";
	}
	
	public void makeAMove(int pozicija) {
		this.table.set(pozicija, this.nextPlayer);
	}
	
	public boolean isWinnerX() {
		if(this.table.get(0).equals("x") &&
				this.table.get(1).equals("x") && 
				this.table.get(2).equals("x")) {
			return true;
		} else if(this.table.get(3).equals("x") &&
				this.table.get(4).equals("x") && 
				this.table.get(5).equals("x")) {
			return true;
		} else if(this.table.get(6).equals("x") &&
				this.table.get(7).equals("x") && 
				this.table.get(8).equals("x")) {
			return true;
		} else if(this.table.get(0).equals("x") &&
				this.table.get(3).equals("x") && 
				this.table.get(6).equals("x")) {
			return true;
		}else if(this.table.get(1).equals("x") &&
				this.table.get(4).equals("x") && 
				this.table.get(7).equals("x")) {
			return true;
		}else if(this.table.get(2).equals("x") &&
				this.table.get(5).equals("x") && 
				this.table.get(8).equals("x")) {
			return true;
		}else if(this.table.get(0).equals("x") &&
				this.table.get(4).equals("x") && 
				this.table.get(8).equals("x")) {
			return true;
		}else if(this.table.get(2).equals("x") &&
				this.table.get(4).equals("x") && 
				this.table.get(6).equals("x")) {
			return true;
		} else return false;
	}
	
	
	public boolean isWinnerO() {
		if(this.table.get(0).equals("o") &&
				this.table.get(1).equals("o") && 
				this.table.get(2).equals("o")) {
			return true;
		} else if(this.table.get(3).equals("o") &&
				this.table.get(4).equals("o") && 
				this.table.get(5).equals("o")) {
			return true;
		} else if(this.table.get(6).equals("o") &&
				this.table.get(7).equals("o") && 
				this.table.get(8).equals("o")) {
			return true;
		} else if(this.table.get(0).equals("o") &&
				this.table.get(3).equals("o") && 
				this.table.get(6).equals("o")) {
			return true;
		}else if(this.table.get(1).equals("o") &&
				this.table.get(4).equals("o") && 
				this.table.get(7).equals("o")) {
			return true;
		}else if(this.table.get(2).equals("o") &&
				this.table.get(5).equals("o") && 
				this.table.get(8).equals("o")) {
			return true;
		}else if(this.table.get(0).equals("o") &&
				this.table.get(4).equals("o") && 
				this.table.get(8).equals("o")) {
			return true;
		}else if(this.table.get(2).equals("o") &&
				this.table.get(4).equals("o") && 
				this.table.get(6).equals("o")) {
			return true;
		} else return false;
	}
	
	public boolean isValidMove(int pozicija) {
		if(pozicija >= 0 && pozicija < 9) {
			return true;
		} else return false;
		
	}
	
	public int gameScore() {
		if(isWinnerX()) {
			return 1;
		} else if(isWinnerO()) {
			return 2;
		} else return 0;
			
	}
	
	
	
	
	
	}
	
	
	
		

	
	
	

	
	
	
	
	
	


