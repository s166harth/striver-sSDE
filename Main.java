class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
		Queue<Points> queue = new LinkedList<>();
        int countLevels = 0;
        
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        //put all the rotten oranges in queue
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2)
                    queue.offer(new Points(i,j));
            }
        }        
        //process all the oranges
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean isUpdated = false;
            while(size-->0){
                Points point = queue.poll();
                for(int[] direction : directions){
                    int x = direction[0]  + point.x;
                    int y = direction[1]  + point.y;
                    if(x<0 || y<0 || y>m-1 || x>n-1)
                        continue;
                    if(grid[x][y]==1){
                        isUpdated = true;
                        grid[x][y] = 2;
                        queue.offer(new Points(x,y));
                    }
                }
            }
            if(isUpdated)
                countLevels++;
        }
        
        boolean isPossible = isPossible(grid,n,m);
        return isPossible?countLevels:-1;
	}

    public static boolean isPossible(int[][] grid,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    return false;
            }
        }
        return true;
    }
}
class Points{
    int x;
    int y;
    Points(int x,int y){
        this.x = x;
        this.y = y;
    }
}