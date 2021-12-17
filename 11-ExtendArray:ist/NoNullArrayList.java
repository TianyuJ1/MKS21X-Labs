import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  /*public statis void Main(String[]args){
    System.out.println(super.addAll();

  }*/
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public addAll(int index, T value){
      if (value == null)
    }throw new(illegalArgumentException e){
      System.out.println("error");
    }
    return super.addAll(index, value);
  }

  public boolean add(T value) {
    if (val == null) {
    return true;
  }throw new(illegalArgumentException ex){
    System.out.println("error");
    }
   return super.add(value);
  }

  public void add(int index, T value) {
   try{
    if (val == null) {
      return super.add(index, value);
    }catch(illegalArgumentException ex){
      System.out.println("error");
    }
  }
 }
}
