import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  int seed;

  //assume a rectangular grid
  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    for for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        filename = 

    //You are writing this

  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int seed){
    rng = new Random(seed);
    this.seed = seed;
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }
}
/*
/*Lab9: Word Search generator

public class WordSearch{
  public main
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch

    public WordSearch(int rows,int cols){
      data = new int[rows][cols];


    /**Set all values in the WordSearch to underscores'_'
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
     *separated by newlines.

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
     * and the board is NOT modified.



    public boolean addWordHorizontal(String word,int row, int col){
    	boolean WordGrid = false;
    	boolean match = false;
    	int count = 0;

/*
      int wordLength = words.get(i).length();
      int NewRow = RandomRange(row);

      if (wordLength > NewRow){
        for (int i = 0; i < wordLength; i ++){
          row[i] = word[i]
        }

      for(int i = row; i < data.length();i ++){
        if(row[i-1])


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
     *and the board is NOT modified.

    public boolean addWordVertical(String word,int row, int col){
    }
}*/
