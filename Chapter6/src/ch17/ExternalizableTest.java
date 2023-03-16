package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Externalizable {
	
	String name;
	String job;
	
	public Person2() {}
	public Person2(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
	}
}

public class ExternalizableTest {

	public static void main(String[] args) {
		
		Person2 personLee = new Person2("이희수", "대표이사");
		Person2 personKim = new Person2("김민주", "상무이사");
		
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		try (FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		
	}

}
