class Pair{
    int x;
    int y;
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
    
}
class Solution {
    public boolean isValid(int x,int y,int[][] grid){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]!=1){return false;}
        return true;
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int time = -1;
        int oranges = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair(i,j));
                }
                if(grid[i][j] == 1){
                    oranges++;
                }
            }
        }
        //System.out.println(q.size());
        if(oranges==0){return 0;}
        while(!q.isEmpty()){
            int n = q.size();
            
            for(int i=0;i<n;i++){
                Pair p = q.poll();
                int x = p.x;
                int y = p.y;
             //   System.out.println(x +" " +y);
                if(isValid(x+1,y,grid)){
             //       System.out.println("yes");
                    grid[x+1][y] = 2;
                    q.offer(new Pair(x+1,y));
                }
                if(isValid(x-1,y,grid)){
              //      System.out.println("yes");
                    grid[x-1][y] = 2;
                    q.offer(new Pair(x-1,y));
                    
                }
                if(isValid(x,y+1,grid)){
              //      System.out.println("yes");
                     grid[x][y+1] = 2;
                    q.offer(new Pair(x,y+1));
                   
                }
                if(isValid(x,y-1,grid)){
               //     System.out.println("yes");
                    grid[x][y-1] = 2;
                    q.offer(new Pair(x,y-1));
                    
                }
            }
            
            time++;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }
}