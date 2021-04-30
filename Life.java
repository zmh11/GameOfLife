public class Life {
  Grid curentGen;
  Grid neighbors;
  Grid nextGen;
  
  public Life(){
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
  }
  public Life(Grid firstGen){
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
    set(firstGen, curentGen);
    curentGen.show();
  }

  public void set( Grid newSet, Grid oldSet){
    for( int i = 0; i <20; i++){
      for (int k=0; k< 20; k++){
        oldSet.set(i, k, newSet.get(i, k));
      }
    }
  }



}
