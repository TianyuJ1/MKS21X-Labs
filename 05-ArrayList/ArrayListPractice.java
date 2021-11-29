public class ArrayListPractice {
    private int size;
    private String data;

    public static ArrayList<String> replaceEmpty( ArrayList<String> data){
//return an new ArrayList that has all of the values of the original ArrayList except
//that all empty strings are replaced with the word "Empty".
        String replaceEmpty = "{";
        for (int i = 0; i < ArrayList.size(); i++){
            if (i == null){
                  replaceEmpty += "Empty" + ",";
              }else{
                  replaceEmpty += ArrayList.get(i) + ",";
              }
            replaceEmpty += "}";
        }
     }

    public static ArrayList<String> makeReversedList( ArrayList<String> data){
//return a new ArrayList that is in the reversed order of the parameter.
        String makeReversedList = "{";
        for ( int i = makeReversedList.size(); i >= 0; i --){
            makeReversedList += ArrayList.get(i) + ",";
        }
        makeReversedList += "}";
}
/*
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
//return a new ArrayList that has all values of a and b in alternating order that is:
//a[0], b[0], a[1], b[1]...
//when one list is longer than the other, just append the remaining values to the end.
}
}
*/
}
