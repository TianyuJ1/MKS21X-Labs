public class TesterW{
  public static void main(String[]args){
    int row = Integer.parseInt(args[0]));
    int col = Integer.parseInt(args[0]));
    WordSearch board = new WordSearch(10,10);
    board.addWordHorizontal("pizza");
    board.printBoard();

  }
