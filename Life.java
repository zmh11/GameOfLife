public class Life {
  Grid curentGen;
  Grid neighbors;
  Grid nextGen;
  
  public Life(){
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
  }

  public Life(Grid firstGen) throws InterruptedException{
    curentGen = new Grid();
    neighbors = new Grid();
    nextGen = new Grid();
    curentGen.set(firstGen);
   Neighbors gen1 = new Neighbors(curentGen);
   gen1.start();
   gen1.t.join();

   
   
    curentGen.show();
    System.out.println("  ");
    gen1.neighbors.showNum();
  }
}
