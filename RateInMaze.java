package backtracking;

public class RateInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][]= {{1,1,1},{1,1,1},{1,1,1}};
	ratInMaze(maze);
//		System.out.println(pathPossible);
	

	} 
	

	static void ratInMaze(int[][] maze) {
		int n=maze.length;
		// make a path matrix to remember the result of the path
		int [][]path=new int[n][n];
		 allPosible(maze,0,0,path);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static void allPosible(int maze[][],int i,int j,int path[][]) {
		int n=maze.length;
		
		if(i<0 || i>=n ||j<0 || j>= n || maze[i][j]==0 || path[i][j]==1 ) {
			return;
		}
		path[i][j]=1;
		if(i==n-1 && j==n-1) {
			//print the path matrix 
			for(int x=0;x<path.length;x++) {
				for(int y=0;y<path.length;y++) {
					
						System.out.print(path[x][y]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
			path[i][j]=0;
			
			return ;
		}
		allPosible(maze,i+1,j+1,path);
		//for going to up
		allPosible(maze,i-1,j,path) ;
			
			//going for right
		
		allPosible(maze,i,j+1,path); 
		
			//going for down
			
		allPosible(maze,i+1,j,path);
			
		
//going for left
		allPosible(maze,i,j-1,path);
		
		path[i][j]=0; 
	
		
	

	}
	
	
	
	//Solve maze method only check for path is avalabal or not
	
	
	
	static boolean solveMaze(int maze[][],int i,int j,int path[][]) {
		int n=maze.length;
		if(i<0 || i>=n ||j<0 || j>= n || maze[i][j]==0 || path[i][j]==1 ) {
			return false;
		}
		path[i][j]=1;
		if(i==n-1 && j==n-1) {
			for(int x=0;x<path.length;x++) {
				for(int y=0;y<path.length;y++) {
					
						System.out.print(path[x][y]+" ");
					
				}
				System.out.println();
			}
			return true;
		}
		if(solveMaze(maze,i-1,j,path)) {
			
			return true;
		}
		if(solveMaze(maze,i,j+1,path)) {
			
			return true;
		}

		if(solveMaze(maze,i+1,j,path)) {
			
			return true;
		}

		if(solveMaze(maze,i,j-1,path)) {
			
			return true;
		}
		return false;

	}

}
