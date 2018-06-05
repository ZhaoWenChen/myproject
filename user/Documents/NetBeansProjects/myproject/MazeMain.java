package com.java2.oo;

public class MazeMain {
	
	public MazeMain() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MazeMain();
	}
	
	class Maze {
		int row,col;
		int trapCount;
		int[] traps;
		Player player;
		
		public Maze(int row, int col, int trapCount) {
			super();
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
		}
	}
	
	class Player {
		int hp = 100;
		int pos = 0;
	}
}
