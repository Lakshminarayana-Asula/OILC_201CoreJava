import java.io.*;
public class FileCheck {
	static int count  = 0;
	static void displayFiles(String name) {
		File f = new File(name);
		if(f.isDirectory()) {
			String[] files = f.list();
			
			for(String s : files) {
				s = name + "/" + s;
				File f1 = new File(s);
				
				if(f1.isDirectory()) {
					displayFiles(s);
				}
				
				System.out.println(s);
				count++;
				
			}
		}
		else {
			System.out.println(f);
		}
		
	}

	public static void main(String[] args) {
		displayFiles("F:\\FileCheck");
		System.out.println("Number of files are: " + count);
	}

}
