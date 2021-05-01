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
    numGen = numGen;

    curentGen.set(firstGen);

    for (int k = 0; k < numGen; k++){
      Neighbors gen1 = new Neighbors(curentGen);
      gen1.start();
      gen1.t.join();

      nextGen.nextGen(curentGen, gen1.neighbors);
      curentGen.set(nextGen);
      System.out.println(k);
      curentGen.show();
    }

   

    //curentGen.show();
    //System.out.println("  ");
    //gen1.neighbors.showNum();
  }
}
