public class Grid {
  int[][] grid;

  public Grid(){
    grid = new int[20][20];
  }

  public void set( int i, int k, int set){
    grid[i][k] = set; 
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
  public void set( Grid newSet ){
    for( int i = 0; i <20; i++){
      for (int k=0; k< 20; k++){
        this.set(i, k, newSet.get(i, k));
      }
    }
  }

  
  public void nextGen( Grid curentGen, Grid neighbors){
    for( int i = 0; i <20; i++){
      for (int k=0; k< 20; k++){
        if( curentGen.get(i, k) != 1 && neighbors.get(i, k) ==3 )
          this.set(i, k, 1);
        else if ( curentGen.get(i, k)==1 && neighbors.get(i, k) >= 4)
          this.set(i,k,0);
        else if (curentGen.get(i, k) ==1 &&neighbors.get(i, k) == 0)
          this.set(i,k,1);
        else if (curentGen.get(i, k) == 1 &&neighbors.get(i, k) == 2 || neighbors.get(i, k) == 3)
          this.set(i, k, 1);
        else 
          this.set(i, k, 0);

      }
    }
  }
  
  
  public void showNum(){
    for( int i = 0; i <20; i++){
      for (int k=0; k< 20; k++){
      System.out.print(grid[i][k]);
      }
    System.out.println();
    }
  }



}
