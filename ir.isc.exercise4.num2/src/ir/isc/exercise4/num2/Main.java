package ir.isc.exercise4.num2;

public class Main {

	public static void main(String[] args) throws FileUtilsException {
		String data = "Hellooooo";
		String fileName = "example.txt";

		FileUtility.WriteFile(data, fileName);
		FileUtility.readFile(fileName);
		System.out.println(fileName);
		


	}

}
