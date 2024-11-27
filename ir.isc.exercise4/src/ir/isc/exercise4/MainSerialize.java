package ir.isc.exercise4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MainSerialize {

	public static void main(String[] args) {
		
		String account1 = "Account1";
        String account2 = "Account2";
        
		User user1 = new User(Arrays.asList(account1,account2), "KianaM.Hosseini", "Pass12345", "123456789");
		
		

        // سریالایز کردن شیء
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user1.ser"))) {
            oos.writeObject(user1);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // دی‌سریالایز کردن شیء
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user1.ser"))) {
            User deserializedPerson = (User) ois.readObject();
            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}
