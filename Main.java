import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main{
  public static void main( String args[] ) throws Exception{

    Grid grid = new Grid();
    Scanner sc = new Scanner(new BufferedReader(new FileReader("Start.txt")));
    String line;
    int gen;
    for (int j = 0; j < 20; j++ ){ // read file 
      line = sc.nextLine();
      for ( int i = 0; i < line.length(); i++){
        if( line.charAt(i) == 'X')
          grid.set(j, i, 1);
      }
    }
    gen = sc.nextInt();
    System.out.println(gen);
    sc.close();
    grid.show();

  }
}