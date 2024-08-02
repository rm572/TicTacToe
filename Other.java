// package TicTacToe;

import java.util.*;

// import graph.DrawingPanel;

import java.io.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;

// public class Other {
// 	public static String[][] BOARD = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
// 	public static DrawingPanel PANEL = new DrawingPanel(300, 400);
// 	public static Graphics G = PANEL.getGraphics();
// 	public static int LENGTH = PANEL.getWidth();
// 	public static int DIFF = PANEL.getHeight() - LENGTH;
// 	public static int POS = (LENGTH - 30)/3;
// 	public static int LW = 15;
// 	public static int[] SCOREBOARD = {0, 0};
	
// 	public static void main(String[] args) {
// 		Scanner console = new Scanner(System.in);
// 		int totalMoves;
// 		while(true) {
// 			boolean gameOn = true;
// 			totalMoves = 0;
// 			resetBoard();
// 			int currentPlayer = 1;
// 			printBoard();
// 			while(gameOn) {
// 				currentPlayer = (currentPlayer + 1) % 2;
// 				int x;
// 				int y;
// 				updateScore();
// 				while(true) {
// 					System.out.println("Player " + (currentPlayer +1) + "'s move");
// 					System.out.print("Enter x-coordinate: ");
// 					x = console.nextInt();
// 					System.out.print("Enter y-coordinate: ");
// 					y = console.nextInt();
// 					if ((0 <= x && x <= 2) && (0 <= y && y <= 2) && BOARD[y][x].equals(" ")) {
// 						break;
// 					}
// 					printBoard();
					
// 				}
// 				totalMoves++;
// 				playerMove(x, y, currentPlayer);
// 				printBoard();
// 				gameOn = contGame();
// 				if(totalMoves == 9) {
// 					break;
// 				}
// 			}
			
// 			if (gameOn == false) {
// 				System.out.println("Congratulations! Player " + (currentPlayer+1) + " wins!");
// 				SCOREBOARD[currentPlayer]++;
// //				updateScore();
// 			}
// 			else if (totalMoves == 9) {
// 				System.out.println("It's a draw!");
// 			}

// 			System.out.println();
// 			System.out.println("*****SCORE*****");
// 			System.out.println(SCOREBOARD[0] + " : " + SCOREBOARD[1]);
// 			System.out.println("***************");
// 			System.out.println("Do you want to play again? ");
// 			System.out.print("Press q to quit and any other key to continue: ");
// 			String s = console.next();
// 			System.out.println();
// 			if (s.toUpperCase().equals("Q")) {
// 				break;
// 			}	
// 		}
// 		console.close();
// 	}
	
// 	public static String[][] playerMove(int x, int y, int player) {
// 		String p;
// 		if (player == 0) {
// 			p = "O";
// 			G.setColor(Color.GREEN);
// 			G.fillOval(x * LW + x * POS, 100 + y * LW + y * POS, POS, POS);
			
// 		}
// 		else {
// 			p = "X";
// 			G.setColor(Color.RED);
// 			G.fillOval(x * LW + x * POS, 100 + y * LW + y * POS, POS, POS);
// 		}
// 		BOARD[y][x] = p;
		
// 		return BOARD;
// 	}
	
// 	public static boolean contGame() {
// 		//Vertical
// 		if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][0]) && (BOARD[0][0] == BOARD[2][0]))) {
// 			return false; 
// 		}
// 		else if (!(BOARD[1][0].equals(" ")) && ((BOARD[1][0] == BOARD[1][1]) && (BOARD[1][0] == BOARD[1][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[2][1]) && (BOARD[2][0] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		//Horizontal
// 		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[0][1]) && (BOARD[0][0] == BOARD[0][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[0][1].equals(" ")) && ((BOARD[0][1] == BOARD[1][1]) && (BOARD[0][1] == BOARD[2][1]))) {
// 			return false;
// 		}	
// 		else if (!(BOARD[0][2].equals(" ")) && ((BOARD[0][2] == BOARD[1][2]) && (BOARD[0][2] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		//diagonal
// 		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][1]) && (BOARD[0][0] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[1][1]) && (BOARD[2][0] == BOARD[0][2]))) {
// 			return false;
// 		}
// 		return true;
// 	}
// 	public static void printBoard() {
// 		for (int i = 0; i < 3; i++) {
// 			for (int j = 0; j < 3; j++) {
// 				System.out.print("|" + BOARD[i][j]);
// 			}
// 			System.out.print("|");
// 			System.out.println();
// 		}
// 	}
	
// 	public static void updateScore() {
// 		G.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
// 		G.setColor(Color.GREEN);
// 		G.drawString(SCOREBOARD[0] + " ", 100, 50);
		
// 		G.setColor(Color.BLACK);
// 		G.drawString(":", LENGTH/2, 50);
		
// 		G.setColor(Color.RED);
// 		G.drawString(" " + SCOREBOARD[1], 175, 50);
// 	}
	
// 	public static void resetBoard() {
// 		for (int i = 0; i < 3; i++) {
// 			for (int j = 0; j < 3; j++) {
// 				BOARD[j][i] = " ";
// 			}
// 		}
		
// 		PANEL.clear();
// 		G.setColor(Color.BLACK);
		
// 		//vertical lines
// 		G.fillRect(POS, DIFF, LW, LENGTH);
// 		G.fillRect(2 * POS + LW, DIFF, LW, LENGTH);
		
// 		//horizontal lines
// 		G.fillRect(0, DIFF + POS, LENGTH, LW);
// 		G.fillRect(0, DIFF + 2 * POS + LW, LENGTH, LW);
			
// 	}
	
// }

//DrawingPanel TicTacToe 2 players
// public class Other {
// 	public static String[][] BOARD = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
// 	public static DrawingPanel PANEL = new DrawingPanel(300, 400);
// 	public static Graphics G = PANEL.getGraphics();
// 	public static int LENGTH = PANEL.getWidth();
// 	public static int DIFF = PANEL.getHeight() - LENGTH;
// 	public static int POS = (LENGTH - 30)/3;
// 	public static int LW = 15;
// 	public static int[] SCOREBOARD = {0, 0};
	
// 	public static void main(String[] args) {
// 		Scanner console = new Scanner(System.in);
// 		int totalMoves;
// 		while(true) {
// 			boolean gameOn = true;
// 			totalMoves = 0;
// 			resetBoard();
// 			int currentPlayer = 1;
// 			printBoard();
// 			while(gameOn) {
// 				currentPlayer = (currentPlayer + 1) % 2;
// 				int x;
// 				int y;
// 				updateScore();
// 				while(true) {
// 					System.out.println("Player " + (currentPlayer +1) + "'s move");
// 					System.out.print("Enter x-coordinate: ");
// 					x = console.nextInt();
// 					System.out.print("Enter y-coordinate: ");
// 					y = console.nextInt();
// 					if ((0 <= x && x <= 2) && (0 <= y && y <= 2) && BOARD[y][x].equals(" ")) {
// 						break;
// 					}
// 					printBoard();
					
// 				}
// 				totalMoves++;
// 				playerMove(x, y, currentPlayer);
// 				printBoard();
// 				gameOn = contGame();
// 				if(totalMoves == 9) {
// 					break;
// 				}
// 			}
			
// 			if (gameOn == false) {
// 				System.out.println("Congratulations! Player " + (currentPlayer+1) + " wins!");
// 				SCOREBOARD[currentPlayer]++;
// //				updateScore();
// 			}
// 			else if (totalMoves == 9) {
// 				System.out.println("It's a draw!");
// 			}

// 			System.out.println();
// 			System.out.println("*****SCORE*****");
// 			System.out.println(SCOREBOARD[0] + " : " + SCOREBOARD[1]);
// 			System.out.println("***************");
// 			System.out.println("Do you want to play again? ");
// 			System.out.print("Press q to quit and any other key to continue: ");
// 			String s = console.next();
// 			System.out.println();
// 			if (s.toUpperCase().equals("Q")) {
// 				break;
// 			}	
// 		}
// 		console.close();
// 	}
	
// 	public static String[][] playerMove(int x, int y, int player) {
// 		String p;
// 		if (player == 0) {
// 			p = "O";
// 			G.setColor(Color.GREEN);
// 			G.fillOval(x * LW + x * POS, 100 + y * LW + y * POS, POS, POS);
			
// 		}
// 		else {
// 			p = "X";
// 			G.setColor(Color.RED);
// 			G.fillOval(x * LW + x * POS, 100 + y * LW + y * POS, POS, POS);
// 		}
// 		BOARD[y][x] = p;
		
// 		return BOARD;
// 	}
	
// 	public static boolean contGame() {
// 		//Vertical
// 		if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][0]) && (BOARD[0][0] == BOARD[2][0]))) {
// 			return false; 
// 		}
// 		else if (!(BOARD[1][0].equals(" ")) && ((BOARD[1][0] == BOARD[1][1]) && (BOARD[1][0] == BOARD[1][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[2][1]) && (BOARD[2][0] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		//Horizontal
// 		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[0][1]) && (BOARD[0][0] == BOARD[0][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[0][1].equals(" ")) && ((BOARD[0][1] == BOARD[1][1]) && (BOARD[0][1] == BOARD[2][1]))) {
// 			return false;
// 		}	
// 		else if (!(BOARD[0][2].equals(" ")) && ((BOARD[0][2] == BOARD[1][2]) && (BOARD[0][2] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		//diagonal
// 		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][1]) && (BOARD[0][0] == BOARD[2][2]))) {
// 			return false;
// 		}
// 		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[1][1]) && (BOARD[2][0] == BOARD[0][2]))) {
// 			return false;
// 		}
// 		return true;
// 	}
	
// 	public static void printBoard() {
// 		for (int i = 0; i < 3; i++) {
// 			for (int j = 0; j < 3; j++) {
// 				System.out.print("|" + BOARD[i][j]);
// 			}
// 			System.out.print("|");
// 			System.out.println();
// 		}
// 	}
	
// 	public static void updateScore() {
// 		G.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
// 		G.setColor(Color.GREEN);
// 		G.drawString(SCOREBOARD[0] + " ", 100, 50);
		
// 		G.setColor(Color.BLACK);
// 		G.drawString(":", LENGTH/2, 50);
		
// 		G.setColor(Color.RED);
// 		G.drawString(" " + SCOREBOARD[1], 175, 50);
// 	}
	
// 	public static void resetBoard() {
// 		for (int i = 0; i < 3; i++) {
// 			for (int j = 0; j < 3; j++) {
// 				BOARD[j][i] = " ";
// 			}
// 		}
		
// 		PANEL.clear();
// 		G.setColor(Color.BLACK);
		
// 		//vertical lines
// 		G.fillRect(POS, DIFF, LW, LENGTH);
// 		G.fillRect(2 * POS + LW, DIFF, LW, LENGTH);
		
// 		//horizontal lines
// 		G.fillRect(0, DIFF + POS, LENGTH, LW);
// 		G.fillRect(0, DIFF + 2 * POS + LW, LENGTH, LW);
			
// 	}
	
// }


//DrawingPanel TicTacToe - Minimax works

public class Other {
	public static String[][] BOARD = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
	public static DrawingPanel PANEL = new DrawingPanel(300, 400);
	public static Graphics G = PANEL.getGraphics();
	public static int LENGTH = PANEL.getWidth();
	public static int PLAYER = 0;
	public static int DIFF = PANEL.getHeight() - LENGTH;
	public static int POS = (LENGTH - 30)/3;
	public static int LW = 15;
	public static int TOTAL_MOVES = 0;
	public static int[] SCOREBOARD = {0, 0};
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		while(true) {
			boolean gameOn = true;
			resetBoard();
			PLAYER = 1;
			printBoard();
			while(gameOn) {
				PLAYER = (PLAYER + 1) % 2;
				int x;
				int y;
				updateScore();
				if (PLAYER == 0) {
					while(true) {
						System.out.println("Player " + (PLAYER +1) + "'s move");
						System.out.print("Enter x-coordinate: ");
						x = console.nextInt();
						System.out.print("Enter y-coordinate: ");
						y = console.nextInt();
						if ((0 <= x && x <= 2) && (0 <= y && y <= 2) && BOARD[y][x].equals(" ")) {
							TOTAL_MOVES++;
							playerMove(x, y, PLAYER);
							printBoard();
							break;
						}

					}
				}
				else {
					int[] moves = compMove();
					playerMove(moves[1], moves[0], PLAYER);
					TOTAL_MOVES++;
					printBoard();
				}

				printBoard();
				gameOn = contGame();
				if(TOTAL_MOVES == 9) {
					break;
				}
			}
			
			if (gameOn == false) {
				System.out.println("Congratulations! Player " + (PLAYER+1) + " wins!");
				SCOREBOARD[PLAYER]++;
//				updateScore();
			}
			else if (TOTAL_MOVES == 9) {
				System.out.println("It's a draw!");
			}

			System.out.println();
			System.out.println("*****SCORE*****");
			System.out.println(SCOREBOARD[0] + " : " + SCOREBOARD[1]);
			System.out.println("***************");
			System.out.println("Do you want to play again? ");
			System.out.print("Press q to quit and any other key to continue: ");
			String s = console.next();
			System.out.println();
			if (s.toUpperCase().equals("Q")) {
				break;
			}	
		}
		console.close();
	}
	
	public static String[][] playerMove(int col, int row, int player) {
		String p;
		if (player == 0) {
			p = "O";
			G.setColor(Color.GREEN);
			G.fillOval(col * LW + col * POS, 100 + row * LW + row * POS, POS, POS);
			
		}
		else {
			p = "X";
			G.setColor(Color.RED);
			G.fillOval(col * LW + col * POS, 100 + row * LW + row * POS, POS, POS);
		}
		BOARD[row][col] = p;
		
		return BOARD;
	}
	
	public static boolean contGame() {
		//Vertical
		if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][0]) && (BOARD[0][0] == BOARD[2][0]))) {
			return false; 
		}
		else if (!(BOARD[1][0].equals(" ")) && ((BOARD[1][0] == BOARD[1][1]) && (BOARD[1][0] == BOARD[1][2]))) {
			return false;
		}
		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[2][1]) && (BOARD[2][0] == BOARD[2][2]))) {
			return false;
		}
		//Horizontal
		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[0][1]) && (BOARD[0][0] == BOARD[0][2]))) {
			return false;
		}
		else if (!(BOARD[0][1].equals(" ")) && ((BOARD[0][1] == BOARD[1][1]) && (BOARD[0][1] == BOARD[2][1]))) {
			return false;
		}	
		else if (!(BOARD[0][2].equals(" ")) && ((BOARD[0][2] == BOARD[1][2]) && (BOARD[0][2] == BOARD[2][2]))) {
			return false;
		}
		//diagonal
		else if (!(BOARD[0][0].equals(" ")) && ((BOARD[0][0] == BOARD[1][1]) && (BOARD[0][0] == BOARD[2][2]))) {
			return false;
		}
		else if (!(BOARD[2][0].equals(" ")) && ((BOARD[2][0] == BOARD[1][1]) && (BOARD[2][0] == BOARD[0][2]))) {
			return false;
		}
		return true;
	}
	
	public static void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|" + BOARD[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
	}
	
	public static void updateScore() {
		G.setFont(new Font("TimesRoman", Font.PLAIN, 50)); 
		G.setColor(Color.GREEN);
		G.drawString(SCOREBOARD[0] + " ", 100, 50);
		
		G.setColor(Color.BLACK);
		G.drawString(":", LENGTH/2, 50);
		
		G.setColor(Color.RED);
		G.drawString(" " + SCOREBOARD[1], 175, 50);
	}

	public static int[] compMove() {
		int row;
		int col;
		System.out.println("comp");
		
		if (TOTAL_MOVES == 1) {
			if(isMoveLegal(1, 1)) {
				row = 1;
				col = 1;
			}
			else {
				row = 0;
				col = 0;
			}
		}
		else {
			int[] temp = findBestMove();
			row = temp[0];
			col = temp[1];
		}
		BOARD[row][col] = "X";
		return new int[]{row, col};
	}
	
	public static void resetBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				BOARD[j][i] = " ";
			}
		}
		
		PANEL.clear();
		G.setColor(Color.BLACK);
		
		//vertical lines
		G.fillRect(POS, DIFF, LW, LENGTH);
		G.fillRect(2 * POS + LW, DIFF, LW, LENGTH);
		
		//horizontal lines
		G.fillRect(0, DIFF + POS, LENGTH, LW);
		G.fillRect(0, DIFF + 2 * POS + LW, LENGTH, LW);
			
	}

	public static boolean isMoveLegal(int r, int c) {
		try {
			if ((0 <= r && r <= 2) && (0 <= c && c <= 2) && BOARD[r][c].equals(" ")) {
				return true;
			}
			return false;
		}
		catch (Exception e) {
			return false;
		}

	}

	public static int evaluate(boolean g) {
		if (g) {
			return 0;
		}

		else {
			return (PLAYER == 1) ? 10 : -10;
		}
	}

	public static boolean isMovesLeft() {
	    for (int r = 0; r < 3; r++) {
	        for (int c = 0; c < 3; c++) {
	            if (BOARD[r][c].equals(" ")) {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public static int minimax(boolean isComp, int depth)	{
		int score = evaluate(contGame());

		if (score == 10) {
			return score - depth;
		}
		else if (score == -10) {
			return score + depth;
		}
		if (isMovesLeft() == false) {
			return 0;
		}
		
		if (isComp) {
			int best = Integer.MIN_VALUE;

			for (int r = 0; r < 3; r++)	{
			    for (int c = 0; c < 3; c++) {
			        if (isMoveLegal(r, c)) {
			            BOARD[r][c] = "X";
			            
			            best = Math.max(best, minimax(false, depth + 1));
			            BOARD[r][c] = " ";
			        }
				}
			}
			return best;
		}
		
		else {
			int best = Integer.MAX_VALUE;
			
			for (int r = 0; r < 3; r++)	{
			    for (int c = 0; c < 3; c++) {
			        if (isMoveLegal(r, c)) {
			            BOARD[r][c] = "O";
			            best = Math.min(best, minimax(true, depth + 1));
			            BOARD[r][c] = " ";
			        }
			    }
			}
			return best;
		}
	}
	
	
	public static int[] findBestMove()	{
		int bestVal = -1000;
		int[] bestMove = new int[2];
		int col = -1;
		int row = -1;
		for (int r = 0; r < 3; r++)	{
			for (int c = 0; c < 3; c++){
				if (isMoveLegal(r, c)) {
					BOARD[r][c] = "X";
					if (contGame() == false) {
						return new int[]{r, c};
					}
					BOARD[r][c] = " ";
					BOARD[r][c] = "O";

					int moveVal = minimax(true, 0);
			
					BOARD[r][c] = " ";
			
					if (moveVal > bestVal) {
						col = c;
						row = r;
						bestVal = moveVal;
						
					}
				}
			}
		}

		bestMove[0] = row;
		bestMove[1] = col;
		return bestMove;
	}
	
}

