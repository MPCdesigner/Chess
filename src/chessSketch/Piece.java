    package chessSketch;

public abstract class Piece extends Main {
	private int posX, posY, color;
	protected int value;
	Piece(int _posX, int _posY, int _color){
		
		posX = _posX;
		posY= _posY;
		color = _color;
		
	}
	//accessors
	
	int getPosX() {
		return this.posX;
	}
	int getPosY() {
		return this.posY;
	}
	int getColor() {
		return this.color;
	}
	
	abstract char getType();
	public abstract int getValue();
	//move
	void makeMove(int x, int y) {
		pList.remove(board[x][y]); 
		capturedPieces.add(board[x][y]);
		board[x][y] = board[this.posX][this.posY];
		board[this.posX][this.posY]= null; 
		this.posX = x;
		this.posY = y;

		
	}
	 abstract boolean checkLegal(int x1, int y1, int x2, int y2);
}

    