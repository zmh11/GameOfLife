public class NeighborsV2 implements Runnable {
  public Thread t;
  Grid curentGen;
  private Grid neighbors;
  int c;
  int r;

  NeighborsV2( Grid curentGrid, Grid neighbors, int r, int c){
    this.curentGen =curentGrid;
    this.neighbors=neighbors; 
    this.c=c;
    this.r=r;
  }
  public void start(){
    t = new Thread(this);
    t.start();
  }
  @Override public void run(){
    if( c+1 < 20 && curentGen.get(r, c+1) == 1) 
        neighbors.add(r,c);
      if( r+1 < 20 && curentGen.get(r+1, c) == 1)   //grid [r+1][c] )
        neighbors.add(r,c);
      if( r+1 < 20 && c+1 < 20 && curentGen.get(r+1, c+1) == 1) //grid[r+1][c+1] )
        neighbors.add(r,c);
      if( r-1 >= 0 && c+1 < 20 && curentGen.get(r-1, c+1) == 1) //grid[r-1][c+1] )
        neighbors.add(r,c);
      if( r-1 >= 0 && c-1 >= 0 && curentGen.get(r-1, c) == 1)// grid[r-1][c] )
        neighbors.add(r,c);
      if( r-1 >= 0 && c-1 >=0  && curentGen.get(r-1,c-1) == 1)// grid[r-1][c-1] )
        neighbors.add(r,c);
      if( c-1 >= 0 && curentGen.get(r,c-1) == 1) //grid[r][c-1] )
        neighbors.add(r,c);
      if( r+1 < 20 && c-1 >= 0 && curentGen.get(r+1,c-1) ==1) //grid[r+1][c-1] )
        neighbors.add(r,c);
  }


  
}
