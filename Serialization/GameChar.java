import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

class Game implements Serializable {
	// private static final long serialVersionUID = 1l;
	public String name;
	public int age;
	public int health;
	// public transient String notvalue;

	public Game(String name,int age) {
		this.name = name;
		this.age = age;
		this.health = 100;
		// this.notvalue = "Not Serializable";
	}
	//@Override
	//public String toString() {
	//	return "Empp =  name = " + name + "age = " + age + " "+ notvalue;
	// }
}

public class GameChar {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Game personOne = new Game("Livik",20);
		
		int a[] = new int[]{1,2,3,4};
		

		// When i am trying as per create object means giving a error IOException so need to do it on try block 
		ObjectOutputStream outByte = new ObjectOutputStream(new FileOutputStream("Person.ser"));
		outByte.writeObject(personOne);
		System.out.println("The Game Object of the Person can Serialized");
		

		ObjectInputStream inByte = new ObjectInputStream(new FileInputStream("Person.ser"));
		Game outPerson = (Game)inByte.readObject();
		System.out.println(outPerson.age);

	}
}
