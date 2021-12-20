//Lab9: Word Search generator
public class WordSearch{
  public main
    private char[][]data;
    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch*/
    public WordSearch(int rows,int cols){
      data = new int[rows][cols];
    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for(int i = 0; i < data.length(); i ++){
        for(int j = 0; j < data[i].length(); j++){
          data[i][j] = "_";
        }
      }
      }
    }
    /**Each row is a String firstLetter = word.substring(i, i+1)new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.*/
    public String toString(){
    	String variable = "";
    	for(int i = 0; i < data.length(); i ++){
         for(int j = 0; j < data[i].length(); j++){
          variable += data[i][j];
      	}
      	variable += "\n";//new line
      }
      return variable;
    }
    public static int randomRange(int max, int min){
      max = data.length()-1;
      min = data[0];
      Random generator = new random();
      return genreator.nextInt(max - min)+ min;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is String firstLetter = word.substring(i, i+1)added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.*/
    public boolean addWordHorizontal(String word,int row, int col){
    	boolean WordGrid = false;
    	boolean match = false;
    	int count = 0;

      int wordLength = words.get(i).length();
      int NewRow = RandomRange(row);
      if (wordLength > NewRow){
        for (int i = 0; i < wordLength; i ++){
          row[i] = word[i]
        }
      for(int i = row; i < data.length();i ++){
        if(row[i-1] = )
        }
      }
    }
   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.*/
    public boolean addWordVertical(String word,int row, int col){
    }
}

public boolean addWordDiagonal(String word,int row, int col){
      boolean enough = true;
      if (row <= data.length && row >= 0 && col <= data[0].length && col >= 0) {

        int x = data[0].length - col +1;
        int maxLength = x;
        int y = data.length - row + 1;
        if (y < x) {
          maxLength = y;
        }
      }
}

        if (word.length() <= maxLength) {
          int tempR = row;
          int tempC = col;
          for (int i = 0; i < word.length(); i++) {
            if (data[tempR-1][tempC-1] != '_') {
              if (data[tempR-1][tempC-1] != word.charAt(i)) {
                work = false;
                break;
              }
            }

            tempR++;
            tempC++;
          }
          if (work) {
         for (int i = 0; i < word.length(); i++) {
           data[row-1][col - 1] = word.charAt(i);
           row++;
           col++;
         }
         return true;
     }
   }
   return false;
 }
