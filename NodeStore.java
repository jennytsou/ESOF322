package hw02;

// This class implements the storage algorithm node store.
import java.io.*;

public class NodeStore implements StoreStrategy {
	
	private FileWriter fw;

	public NodeStore() throws IOException {
		try {
			fw = new FileWriter("Graph.txt");
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

		System.out.println("Program: \"Your data, " + data + ", was stored using the Graph database tool.\"");

	}
}
