public class Grid {
  int[][] grid;

  public Grid(){
    grid = new int[20][20];
  }

  public void set( int i, int k, int add){
    grid[i][k] = add; 
  }

  public void add( int i, int k){
  grid[i][k] += 1;
}
  public int get(int i, int k){
    return grid[i][k];
  }

  public void show(){
    for( int i = 0; i <20; i++){
      for (int k=0; k< 20; k++){
        if ( grid[i][k] == 1 )
          System.out.print('X');
        else
          System.out.print('O');  
      }
      System.out.println();
    }

  }


}
