package MavenGrp.MavenDemo;

class Animal {
	public Animal() {
		System.out.println("I am super constructor");
	}
	final public String color = "White";
	public void disp() {
		System.out.println("I am the disp method");
	}
}

class Dog extends Animal{
	public Dog() {
		//System.out.println("Testing Begin");
		super();
		System.out.println(super.color);
		super.disp();
	}
	public Dog(String name) {
		System.out.println(name);
	}
	public String color = "Black";
	public void disp() {
		System.out.println("I am the disp child method");
	}
}

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("This is not my test file");
		Dog dg = new Dog();
		System.out.println();
		Dog dg1 = new Dog("Botas");
		//dg.disp();
		//System.out.println(dg.color);
	}

}