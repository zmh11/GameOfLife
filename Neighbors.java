public class Neighbors implements Runnable {
  public Thread t;
  Grid curentGen;
  public Grid neighbors;
  
  Neighbors( Grid currentGrid){
    this.curentGen = currentGrid;
    this.neighbors = new Grid();
  }
  public void start(){
    t = new Thread(this);
    t.start();
  }
    
  @Override public void run()
  {
    for( int r = 0; r <20; r++){
      for (int c=0; c< 20; c++){if( c+1 < 20 && curentGen.get(r, c+1) == 1) 
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
      }}

  }



}
