package Com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class FileCompileTime {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		File file = new File("C:\\Users\\SRI ANJALI\\Desktop"); //gets exception because this file doesn't the permission
		FileInputStream foi = new FileInputStream(file); //checked exception may be the file is doesn't exist
		System.out.println("File is executed");
		}
		catch(IOException im) {
			System.out.println(im);
			
		}
	}

}
