public class Kitty{
	private int age;
	private String name;
	
	public Kitty (){
		age = 2;
		name = "Mittens";
	}
	public Kitty(String a, int b){
		name = a;
		age = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void makeOlder(){
		age += 1;
	}
	public String toString(){
		return "The amazing " + name;
		
	}
	public void changeName(String n){
		name = n;
	}
}
		
