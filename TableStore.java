package hw02;

// This class implements the storage algorithm table store.
import java.io.*;

public class TableStore implements StoreStrategy {
	
	private FileWriter fw;

	public TableStore() throws IOException {
		try {
			fw = new FileWriter("Relational.txt");
		}
		catch (IOException e) {e.printStackTrace();}
	}

	public void storeData(String data) {
		try {
			fw.write(data);
			fw.write(System.lineSeparator());
			fw.flush();
		}
		catch (IOException e) {e.printStackTrace();}

		System.out.println("Program: \"Your data, " + data + ", was stored using the Relational database tool.\"");
	
	}

}
