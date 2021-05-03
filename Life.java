import java.util.ArrayList;

public class Life {
  Grid curentGen;
  Grid neighbors;
  Grid nextGen;
  int numGen;
  
  public Life(){
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
  }

  public Life(Grid firstGen, int numGen) throws InterruptedException{
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
    curentGen.set(firstGen);
 
    // NV2
    for (int k = 0; k < numGen; k++){
      ArrayList<NeighborsV2> neighbor = new ArrayList<>();
       neighbors = new Grid();

      for( int r = 0; r <20; r++){
        for (int c=0; c< 20; c++){
          neighbor.add(new NeighborsV2(curentGen, neighbors, r, c) );
        }
      }
      for (int N = 0; N < 400; N++){
        neighbor.get(N).start();
      }
      for (int N = 0; N < 400; N++){
        neighbor.get(N).t.join();
      }
    
      nextGen.nextGen(curentGen, neighbors);
      curentGen.set(nextGen);
      //System.out.println(k);
      //curentGen.show();
    }
    curentGen.show();

  }
}
