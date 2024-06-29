class NQueenBaktracking 
{

	public static boolean isSafe(char board[][],int row,int col){
		// vertical up
           for (int i=row-1;i>=0 ;i-- )
           {
			   if (board[i][col]=='Q')
			   {
				   return false;
			   }
           }
		//left diagonal
		for (int i=row-1, j=col-1;i>=0 && j>=0 ;i--,j-- )
		{
			if (board[i][j]=='Q')
			{
				return false;
			}
		}


		// right diagonal(i-1,j+1)
		for (int i=row-1, j=col+1;i>=0 && j<board.length ;i--,j++ )
		{
			if (board[i][j]=='Q')
			{
				return false;
			}
		}
		return true;

	}
	public static void nQueen(char board[][],int row){
		// base case
		if (row==board.length)
		{
			printqueen(board);
			return ;
		}
		// recursion for in each col
		for (int j=0;j<board.length ;j++ )
		{
			if (isSafe( board,row,j))
			{
				    board[row][j]='Q';                         
	            	nQueen(board,row+1);// recursio n   	
    				board[row][j]='x'; // backtracking

			}
		}
		
	}
	public static void printqueen(char[][] board){
		System.out.println("***********cheese board***********");
		for (int i=0;i<board.length ;i++ )
		{
			for (int j=0;j<board.length ;j++ )
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		char board[][]=new char[n][n];
             // intilization of board
			 for (int i=0;i<board.length ;i++ )
			 {
				 for (int j=0;j<board.length ;j++ )
				 {
					 board[i][j]='x';
				 }
				 System.out.println();
			 }
			 nQueen(board,0);
	}
}
