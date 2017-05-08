import java.util.Scanner;
public class GameBoard
{
  private static Piece[][] board;
  public GameBoard()
  {
	  board =new Piece[8][8];
	  for(int i =0;i<board.length;i++)
	  {
		  for(int e =0;e<board[0].length;e++) 
		  {
			  board[i][e]=new Piece();
			  if(i==1)
				  board[i][e]= new Piece(" P ","black");
			  else if(i==6)
				  board[i][e]= new Piece("[P]","white");
			  
			  if(i==0&&(e==0||e==7))
				  board[i][e]= new Piece(" R ","black");
			  else if(i==7&&(e==0||e==7))
				  board[i][e]= new Piece("[R]","white");
			  if(i==0&&(e==1||e==6))
				  board[i][e]= new Piece(" N ","black");
			  else if(i==7&&(e==1||e==6))
				  board[i][e]= new Piece("[N]","white");
			  if(i==0&&(e==2||e==5))
				  board[i][e]= new Piece(" B ","black");
			  else if(i==7&&(e==2||e==5))
				  board[i][e]= new Piece("[B]","white");
			  if(i==0&&e==3)
				  board[i][e]= new Piece(" Q ","black");
			  else if(i==7&&e==3)
				  board[i][e]= new Piece("[Q]","white");
			  if(i==0&&e==4)
				  board[i][e]= new Piece(" K ","black");
			  else if(i==7&&e==4)
				  board[i][e]= new Piece("[K]","white");
			  
			  
			
		  }
	  }
  }
  public boolean checkWin()
  {
	  int count=0;
  
	  for(int i =0;i<this.getBoard().length;i++)
	  {
		  for(int e =0;e<this.getBoard()[0].length;e++) 
		  {
			  if(this.getBoard()[i][e].getId().compareTo(" K ")==0||this.getBoard()[i][e].getId().compareTo("[K]")==0)
				  count++;
		  }
	  }
	  return count==2;
  }
  public Piece[][] getBoard() 
  {
	
	return board;
  }
public void print()
  {
	  int x =0;
	  System.out.println("Black");
	  for(int i =0;i<board.length;i++)
	  {
		System.out.print(x+" | ");
		x++;
		  for(int e =0;e<board[0].length;e++) 
		  {
				System.out.print(board[i][e]+" "+"|"+" ");
		  }
		System.out.println();
		System.out.println("   _____ _____ _____ _____ _____ _____ _____ _____");
	  } 
	  System.out.println("     0     1     2     3     4     5     6     7  White");
  }
  public static void Play(int row,int col, int toRow,int toCol)
  {
	  if(board[row][col].getId().compareTo(" P ")==0||board[row][col].getId().compareTo("[P]")==0)
		  if(Piece.checkMoveForPawn(row,col,toRow,toCol))
		  {
			  board[toRow][toCol]=board[row][col];
			  board[row][col]=new Piece();
		  }
	  if(board[row][col].getId().compareTo(" R ")==0||board[row][col].getId().compareTo("[R]")==0)
		  if(Piece.checkMoveForRook(row,col,toRow,toCol))
		  {
			  board[toRow][toCol]=board[row][col];
			  board[row][col]=new Piece();
		  }
	  if(board[row][col].getId().compareTo(" N ")==0||board[row][col].getId().compareTo("[N]")==0)
		  if(Piece.checkMoveForKnight(row,col,toRow,toCol))
		  {
			  board[toRow][toCol]=board[row][col];
			  board[row][col]=new Piece();
		  }
	  if(board[row][col].getId().compareTo("[B]")==0||board[row][col].getId().compareTo(" B ")==0)
			  if(Piece.checkMoveForBishop(row,col,toRow,toCol))
			  {
				  board[toRow][toCol]=board[row][col];
				  board[row][col]=new Piece();
			  }
	  if(board[row][col].getId().compareTo("[Q]")==0||board[row][col].getId().compareTo(" Q ")==0)
		  if(Piece.checkMoveForQueen(row,col,toRow,toCol))
		  {
			  board[toRow][toCol]=board[row][col];
			  board[row][col]=new Piece();
		  }
	  if(board[row][col].getId().compareTo(" k ")==0||board[row][col].getId().compareTo("[K]")==0)
		  if(Piece.checkMoveForKing(row,col,toRow,toCol))
		  {
			  board[toRow][toCol]=board[row][col];
			  board[row][col]=new Piece();
		  }
	  
	  
	  
	  
  }
  public static void main(String[] args)
  {
	  GameBoard haha = new GameBoard();
	  boolean player1 =false;
	  boolean player2=false;
	  
	 do{
		  haha.print();
		  Scanner promt = new Scanner(System.in);
		  System.out.println("White's move Please enter Location of desired piece and its destination");
		  System.out.println("row?");
		  int row = promt.nextInt();
		  System.out.println("col?");
		  int col = promt.nextInt();
		  System.out.println("To row?");
		  int toRow = promt.nextInt();
		  System.out.println("To col?");
		  int toCol = promt.nextInt();
		  Play(row,col,toRow,toCol);
		  
		  if(!haha.checkWin())
		  player1=true;
			  if(player1)
		  {
			    haha.print();
			    System.out.println("Player1 won");
		    	break;
		  }
			  System.out.println();
		  haha.print();
		  Scanner promt1 = new Scanner(System.in);
		  System.out.println("Black's move Please enter Location of desired piece and its destination");
		  System.out.println("row?");
		  int row1 = promt.nextInt();
		  System.out.println("col?");
		  int col1 = promt.nextInt();
		  System.out.println("To row?");
		  int toRow1 = promt.nextInt();
		  System.out.println("To col?");
		  int toCol1 = promt.nextInt();
		  Play(row1,col1,toRow1,toCol1);
		  if(!haha.checkWin())
			  player2=true;
				  if(player2)
			  {
				    haha.print();
				    System.out.println("Player2 won");
			    	break;
			  }
				  System.out.println();
		  
		  
		  
	  }while(haha.checkWin());
  }
}



