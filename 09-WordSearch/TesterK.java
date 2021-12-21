public class TesterK{
  public static void main(String[]args){
    int row = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[0]);
    Wordsearch board = new Wordsearch(10,10);
    board.addWordHorizontal("pizza", 2,2);
    board.printBoard();

  }
}
