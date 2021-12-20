public class NoNullArrayList<T> extends ArrayList<T> {
	  public T val;

	  public NoNullArrayList() {
	    super();
	  }

	  public NoNullArrayList(int startingCapacity) {
	    super(startingCapacity);
	  }

	  public T set(int index, T val) {
	    if (val == null) {
	      throw new IllegalArgumentException();
	    } else {super.set(index, val);}
	    return val;
	  }

	  public boolean add(T val) {
	    if (val == null) {
	      throw new IllegalArgumentException();
	    } else {super.add(val);}
	    return true;
	  }

	  public void add(int index, T val) {
	    if (val == null) {
	      throw new IllegalArgumentException();
	    } else {super.add(index, val);}
	  }
	}
