
public class Piece
{
 private String identity;
 private String color;
 public  Piece()
 {
	 identity="   ";
	 color="";
 }
 public Piece(String str, String col) 
{
	identity=str;
	color=col;
}

public String getId()
 {
	 return identity;
 }
 public String getCol()
 {
	 return color;
 }
 public String toString()
 {
	 return identity;
 }
 	public static boolean checkMoveForPawn(int row, int col,int toRow, int toCol)
 	{
	 Boolean isLellgalMove = true;
	 if(row==6||row==1)
		 return true;
	 if(Math.abs(toRow-row)!=1)
		 isLellgalMove=false;
	 return isLellgalMove; 
 	}
 	public static boolean checkMoveForRook(int row, int col,int toRow, int toCol)
 	{
	 Boolean isLellgalMove = false;
	 if(toRow!=row||toCol!=col)
		 isLellgalMove =true;
	 return isLellgalMove;
 	}
 	public static boolean checkMoveForBishop(int row, int col,int toRow, int toCol)
 	{
	 Boolean isLellgalMove = true;
	 if(toRow==row||toCol==col)
		 isLellgalMove=false;
	 return isLellgalMove;
	}
 	public static boolean checkMoveForKnight(int row, int col,int toRow, int toCol)
 	{
	 Boolean isLellgalMove = false;
	 if((Math.abs(toRow-row)==2&&Math.abs(toCol-col)==1)||(Math.abs(toCol-col)==2)&&Math.abs(toRow-row)==1)
		 isLellgalMove=true;
	 return isLellgalMove;
 	}
 	public static boolean checkMoveForQueen(int row, int col,int toRow, int toCol)
 	{
	 return checkMoveForRook(row,col,toRow,toCol)||checkMoveForBishop(row,col,toRow,toCol);
 	}
 	public static boolean checkMoveForKing(int row, int col,int toRow, int toCol)
 	{
 		Boolean isLellgalMove=true;
 		if(Math.abs(row-toRow)>2&&Math.abs(col-toCol)>2)
 			isLellgalMove=false;
 		return isLellgalMove;
 	}
 	
 }
 

